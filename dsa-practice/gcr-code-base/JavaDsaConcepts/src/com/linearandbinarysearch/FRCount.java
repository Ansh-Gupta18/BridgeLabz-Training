package com.linearandbinarysearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FRCount {

    public static void main(String[] args) {

        String filePath = "sample.txt";  // Path to your file
        String targetWord = "java";      // Word to count
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                // Split line into words using space and punctuation as delimiters
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" occurs " + count + " times in the file.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

