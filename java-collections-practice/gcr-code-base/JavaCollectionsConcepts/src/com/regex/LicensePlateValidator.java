package com.regex;

public class LicensePlateValidator {

    // Method to validate license plate number
    public static boolean isValidLicensePlate(String plate) {
        // Regex:
        // ^        -> start
        // [A-Z]{2} -> exactly two uppercase letters
        // \\d{4}   -> exactly four digits
        // $        -> end
        String regex = "^[A-Z]{2}\\d{4}$";
        return plate.matches(regex);
    }

    public static void main(String[] args) {

        String[] testPlates = {
                "AB1234",
                "A12345",
                "ab1234",
                "ABC123",
                "XY9876"
        };

        for (String plate : testPlates) {
            System.out.println(plate + " → " +
                    (isValidLicensePlate(plate) ? "Valid" : "Invalid"));
        }
    }
}

