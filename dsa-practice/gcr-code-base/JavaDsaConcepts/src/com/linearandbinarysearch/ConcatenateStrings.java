package com.linearandbinarysearch;

public class ConcatenateStrings {

    public static String concatenateStrings(String[] arr) {

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Append each string to StringBuffer
        for (String str : arr) {
            sb.append(str);
        }

        // Convert StringBuffer to String and return
        return sb.toString();
    }

    public static void main(String[] args) {

        String[] input = {"Java", " ", "is", " ", "powerful"};

        String result = concatenateStrings(input);

        System.out.println("Concatenated String: " + result);
    }
}
