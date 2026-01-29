package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackAnalyzer<T> {

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d{1,2})/10");

    public Map<String, List<Feedback<T>>> analyzeFeedbacks(File folder, T type) {

        Map<String, List<Feedback<T>>> result = new HashMap<>();
        result.put("Positive", new ArrayList<>());
        result.put("Neutral", new ArrayList<>());
        result.put("Negative", new ArrayList<>());

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null) {
            System.out.println("No feedback files found.");
            return result;
        }

        for (File file : files) {
            readFile(file, type, result);
        }

        return result;
    }

    private void readFile(File file, T type,
                          Map<String, List<Feedback<T>>> result) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    processLine(line, type, result);
                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }

    private void processLine(String line, T type,
                             Map<String, List<Feedback<T>>> result) {

        Matcher matcher = RATING_PATTERN.matcher(line);

        if (!matcher.find())
            throw new IllegalArgumentException("Rating not found");

        int rating = Integer.parseInt(matcher.group(1));

        Feedback<T> feedback = new Feedback<>(type, line, rating);

        if (rating >= 8) {
            result.get("Positive").add(feedback);
        } else if (rating >= 5) {
            result.get("Neutral").add(feedback);
        } else {
            result.get("Negative").add(feedback);
        }
    }
}

