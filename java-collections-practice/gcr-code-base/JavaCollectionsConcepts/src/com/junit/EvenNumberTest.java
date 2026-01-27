package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumberTest {

    // Method to check if a number is even
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Parameterized Test
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        if (number % 2 == 0) {
            assertTrue(isEven(number), number + " should be even");
        } else {
            assertFalse(isEven(number), number + " should be odd");
        }
    }
}
