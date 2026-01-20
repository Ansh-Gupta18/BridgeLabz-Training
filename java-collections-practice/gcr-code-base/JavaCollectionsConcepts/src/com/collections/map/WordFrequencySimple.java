package com.collections.map;
import java.io.*;
import java.util.*;

public class WordFrequencySimple {

    public static void main(String[] args) {

        // HashMap to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Remove punctuation and convert to lowercase
                line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

                // Split into words
                String[] words = line.split("\\s+");

                // Count words
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Use TreeMap to sort words alphabetically
        Map<String, Integer> sortedMap = new TreeMap<>(wordCount);

        // Print the result in format {word=count, ...}
        System.out.println(sortedMap);
    }
}
