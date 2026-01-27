package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

// DateFormatter class
class DateFormatter {

    // Converts yyyy-MM-dd → dd-MM-yyyy
    String formatDate(String inputDate) {
        if (inputDate == null) {
            throw new IllegalArgumentException("Input date cannot be null");
        }
        try {
            DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(inputDate, inputFormat);
            return date.format(outputFormat);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format: " + inputDate);
        }
    }
}

// JUnit Test Class
public class DateFormatterTest {

    DateFormatterTest formatter = new DateFormatterTest();

    @Test
    void testValidDate() {
        assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
        assertEquals("01-01-2000", formatter.formatDate("2000-01-01"));
    }

    private Object formatDate(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> formatter.formatDate("25/12/2023"));
        assertTrue(exception.getMessage().contains("Invalid date format"));

        exception = assertThrows(IllegalArgumentException.class,
                () -> formatter.formatDate("2023-13-01")); // invalid month
        assertTrue(exception.getMessage().contains("Invalid date format"));
    }

    @Test
    void testNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> formatter.formatDate(null));
        assertEquals("Input date cannot be null", exception.getMessage());
    }
}

