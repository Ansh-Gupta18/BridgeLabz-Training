package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // Calculator methods
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // ✅ JUnit Test Cases
    @Test
    void testAdd() {
        assertEquals(10, add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, multiply(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, divide(10, 5));
    }

    // ✅ Bonus: Test division by zero
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> divide(10, 0));
    }
}
