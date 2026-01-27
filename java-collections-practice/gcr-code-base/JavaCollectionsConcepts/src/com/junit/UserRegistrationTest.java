package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

// UserRegistration class
class UserRegistration {

    void registerUser(String username, String email, String password) {
        // Validate username: 5-15 characters, letters, numbers, underscore
        if (username == null || !username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$")) {
            throw new IllegalArgumentException("Invalid username");
        }

        // Validate email: basic regex
        if (email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // Validate password: at least 8 chars, 1 uppercase, 1 digit
        if (password == null || !password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$")) {
            throw new IllegalArgumentException("Invalid password");
        }

        // Registration successful
        System.out.println("User registered successfully: " + username);
    }
}

// JUnit Test Class
class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidUser() {
        assertDoesNotThrow(() -> registration.registerUser(
                "User_123", "user@example.com", "Password1"
        ));
    }

    @Test
    void testInvalidUsername() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("123User", "user@example.com", "Password1"));
        assertEquals("Invalid username", ex.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("User123", "useratexample.com", "Password1"));
        assertEquals("Invalid email", ex.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("User123", "useratexample.com", "Password1"));
        assertEquals("Invalid email", ex.getMessage());
    }
}

