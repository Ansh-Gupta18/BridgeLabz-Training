package com.regex;

public class HexColorValidator {

    // Method to validate hex color code
    public static boolean isValidHexColor(String color) {
        // Regex:
        // ^#           -> starts with #
        // [0-9a-fA-F]  -> hexadecimal characters
        // {6}          -> exactly 6 characters
        // $            -> end of string
        String regex = "^#[0-9a-fA-F]{6}$";
        return color.matches(regex);
    }

    public static void main(String[] args) {

        String[] testColors = {
                "#FFA500",
                "#ff4500",
                "#123",
                "#GGGGGG",
                "FFA500"
        };

        for (String color : testColors) {
            System.out.println(color + " → " +
                    (isValidHexColor(color) ? "Valid" : "Invalid"));
        }
    }
}
