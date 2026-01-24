package com.regex;

public class CreditCardValidator {

    // Method to validate Visa or MasterCard
    public static boolean isValidCard(String cardNumber) {

        // Visa: starts with 4, total 16 digits
        String visaRegex = "^4\\d{15}$";

        // MasterCard: starts with 5, total 16 digits
        String masterRegex = "^5\\d{15}$";

        return cardNumber.matches(visaRegex) ||
               cardNumber.matches(masterRegex);
    }

    public static void main(String[] args) {

        String[] cards = {
                "4123456789012345",  // Visa
                "5123456789012345",  // MasterCard
                "6123456789012345",  // Invalid
                "412345678901234",   // Invalid length
                "51234abcd9012345"   // Invalid characters
        };

        for (String card : cards) {
            System.out.println(card + " → " +
                    (isValidCard(card) ? "Valid" : "Invalid"));
        }
    }
}

