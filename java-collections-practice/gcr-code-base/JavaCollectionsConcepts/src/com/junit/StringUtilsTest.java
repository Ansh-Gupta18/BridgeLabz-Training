package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    // -----------------------------
    // String utility methods
    // -----------------------------
    String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

    // -----------------------------
    // JUnit Test Cases
    // -----------------------------
    @Test
    void testReverse() {
        assertEquals("olleh", reverse("hello"));
        assertEquals("", reverse(""));
        assertNull(reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(isPalindrome("madam"));
        assertTrue(isPalindrome("a"));
        assertFalse(isPalindrome("hello"));
        assertFalse(isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", toUpperCase("hello"));
        assertEquals("", toUpperCase(""));
        assertNull(toUpperCase(null));
    }
}

