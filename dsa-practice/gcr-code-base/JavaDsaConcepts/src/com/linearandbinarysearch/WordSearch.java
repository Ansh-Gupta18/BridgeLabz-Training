package com.linearandbinarysearch;

public class WordSearch {

    // Method to find the first sentence containing the word
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence; // Return the first matching sentence
            }
        }
        return "Not Found"; // No sentence contains the word
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a programming language.",
            "Python is great for data science.",
            "I love coding challenges.",
            "Algorithms are fun to learn."
        };

        String word = "python";

        String result = findSentence(sentences, word);

        System.out.println("Result: " + result);
    }
}

