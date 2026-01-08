package com.linearandbinarysearch;

import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {

        // HashSet to track seen characters
        HashSet<Character> seen = new HashSet<>();

        // StringBuilder to build result
        StringBuilder result = new StringBuilder();

        // Iterate through each character
        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        // Convert StringBuilder to String
        return result.toString();
    }

    public static void main(String[] args) {

        String input = "programming";
        String output = removeDuplicates(input);

        System.out.println("String without duplicates: " + output);
    }
}

