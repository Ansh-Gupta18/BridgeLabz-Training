package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

    // Method that throws ArithmeticException if b is zero
    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // -----------------------------
    // JUnit Test Cases
    // -----------------------------

    @Test
    void testDivideNormal() {
        assertEquals(5, divide(10, 2));
        assertEquals(-3, divide(9, -3));
    }

    @Test
    void testDivideByZero() {
        // Verifies that ArithmeticException is thrown
        assertThrows(ArithmeticException.class, () -> divide(10, 0));
    }
}

