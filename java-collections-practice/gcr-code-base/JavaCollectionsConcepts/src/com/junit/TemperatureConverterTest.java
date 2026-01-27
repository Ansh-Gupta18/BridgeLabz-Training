package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// TemperatureConverter class
class TemperatureConverter{
// Celsius → Fahrenheit
    double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit → Celsius
    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

// JUnit Test Class
public class TemperatureConverterTest {

    TemperatureConverterTest converter = new TemperatureConverterTest();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.001);
    }

    private double celsiusToFahrenheit(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.001);
    }

	private double fahrenheitToCelsius(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
}
