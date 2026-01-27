package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// Step 1: Define field-level annotation
@Retention(RetentionPolicy.RUNTIME)  // available at runtime
@Target(ElementType.FIELD)           // applicable to fields
@interface MaxLength {
    int value();                     // maximum allowed length
}

// Step 2: Apply annotation to User class
class User {

    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        this.username = username;
        validateFields();  // validate annotated fields
    }

    // Step 3: Validate fields using reflection
    private void validateFields() throws Exception {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);
                Object value = field.get(this);
                if (value instanceof String) {
                    String str = (String) value;
                    int maxLength = field.getAnnotation(MaxLength.class).value();
                    if (str.length() > maxLength) {
                        throw new IllegalArgumentException(
                            field.getName() + " exceeds maximum length of " + maxLength
                        );
                    }
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }
}

// Step 4: Test the annotation
public class MaxLengthValidationTest {
    public static void main(String[] args) {
        try {
            User user1 = new User("Ansh");  // valid
            System.out.println("User created: " + user1.getUsername());

            User user2 = new User("VeryLongUsername");  // exceeds limit
            System.out.println("User created: " + user2.getUsername());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
