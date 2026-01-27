package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;

// PasswordValidator class
class PasswordValidator {

    // Method to check password strength
    boolean isValid(String password) {
        if (password == null) return false;
        // Regex: At least 8 chars, 1 uppercase, 1 digit
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        return Pattern.matches(regex, password);
    }
}

// JUnit Test Class
public class PasswordValidatorTest {

    PasswordValidatorTest validator = new PasswordValidatorTest();

    @Test
    void testValidPasswords() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("Abcdefg8H"));
    }

    @Test
    void testInvalidPasswordsTooShort() {
        assertFalse(validator.isValid("Abc1")); // too short
    }

    @Test
    void testInvalidPasswordsNoUppercase() {
        assertFalse(validator.isValid("password1")); // no uppercase
    }

    @Test
    void testInvalidPasswordsNoDigit() {
        assertFalse(validator.isValid("Password")); // no digit
    }

    private BooleanSupplier isValid(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    void testInvalidPasswordsNull() {
        assertFalse(validator.isValid(null)); // null password
    }
}

