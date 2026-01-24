package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LanguageExtractor {

    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // List of programming languages to search for
        String[] languages = { "Java", "Python", "JavaScript", "Go" };

        // Create regex pattern: Java|Python|JavaScript|Go
        String regex = String.join("|", languages);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}

