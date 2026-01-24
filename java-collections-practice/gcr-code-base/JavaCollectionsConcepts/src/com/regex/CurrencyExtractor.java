package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {

    public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        // Regex to match currency values (with or without $)
        String regex = "\\$?\\d+(\\.\\d{1,2})?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}

