package com.linearandbinarysearch;

public class ReverseString {

    public static String reverseString(String input) {

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append the string
        sb.append(input);

        // Reverse the string
        sb.reverse();

        // Convert back to String and return
        return sb.toString();
    }

    public static void main(String[] args) {

        String input = "hello";
        String output = reverseString(input);

        System.out.println("Reversed String: " + output);
    }
}

