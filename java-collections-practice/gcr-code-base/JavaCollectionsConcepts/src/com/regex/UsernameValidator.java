package com.regex;

public class UsernameValidator {

    // Method to validate username
    public static boolean isValidUsername(String username) {
        // Regex explanation:
        // ^            -> start of string
        // [a-zA-Z]     -> must start with a letter
        // [a-zA-Z0-9_] -> allowed characters
        // {4,14}       -> remaining characters (total length 5–15)
        // $            -> end of string
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {

        String[] testUsernames = {
                "user_123",
                "123user",
                "us",
                "Valid_User1",
                "user@123"
        };

        for (String username : testUsernames) {
            System.out.println(username + " → " +
                    (isValidUsername(username) ? "Valid" : "Invalid"));
        }
    }
}
