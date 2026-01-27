package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// Step 1: Define @JsonField annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

// Step 2: User class
class User1 {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    private int age;

    public User1(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

// Step 3: JSON serializer
class JsonSerializer {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);

                if (!first) json.append(", ");
                json.append("\"").append(annotation.name()).append("\": ");

                Object value = field.get(obj);
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
                first = false;
            }
        }
        json.append("}");
        return json.toString();
    }
}

// Step 4: Main class
public class JsonFieldSerializationTest {
    public static void main(String[] args) throws Exception {
        User1 user = new User1("Ansh", "ansh@example.com", 21);
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
