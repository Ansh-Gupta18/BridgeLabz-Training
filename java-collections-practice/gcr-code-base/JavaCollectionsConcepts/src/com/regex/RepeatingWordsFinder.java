package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;

public class RepeatingWordsFinder {

    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        // Regex to find repeated words (case-insensitive)
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1).toLowerCase());
        }

        // Print repeated words
        for (String word : repeatedWords) {
            System.out.print(word + ", ");
        }
    }
}

