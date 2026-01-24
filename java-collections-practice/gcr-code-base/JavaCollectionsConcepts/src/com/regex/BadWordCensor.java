package com.regex;

import java.util.regex.Pattern;

public class BadWordCensor {

    public static void main(String[] args) {

        String input = "This is a damn bad example with some stupid words.";

        // List of bad words
        String[] badWords = { "damn", "stupid" };

        // Create regex pattern: \b(damn|stupid)\b
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        // Replace bad words with **** (case-insensitive)
        String censored = Pattern
                .compile(regex, Pattern.CASE_INSENSITIVE)
                .matcher(input)
                .replaceAll("****");

        System.out.println(censored);
    }
}
