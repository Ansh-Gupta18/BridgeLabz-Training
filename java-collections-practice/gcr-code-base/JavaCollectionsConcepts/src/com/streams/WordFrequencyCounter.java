package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String fileName = "input.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();

        int totalWords = 0;

        // Reading file using FileReader and BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                // Remove punctuation and convert to lowercase
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
            return;
        }

        // Sort words by frequency
        List<Map.Entry<String, Integer>> sortedWords =
                new ArrayList<>(wordCountMap.entrySet());

        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Display results
        System.out.println("Total Words: " + totalWords);
        System.out.println("\nTop 5 Most Frequent Words:");

        for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
