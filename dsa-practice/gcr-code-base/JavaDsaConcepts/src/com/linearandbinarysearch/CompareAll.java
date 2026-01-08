package com.linearandbinarysearch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CompareAll {

    public static void main(String[] args) {

        // ---------------- String Concatenation ----------------
        int iterations = 1_000_000;
        String text = "hello";

        // StringBuilder test
        StringBuilder sb = new StringBuilder();
        long startSB = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endSB = System.nanoTime();
        System.out.println("StringBuilder concatenation time: " + (endSB - startSB) + " ns");

        // StringBuffer test
        StringBuffer sbuf = new StringBuffer();
        long startSBuf = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }
        long endSBuf = System.nanoTime();
        System.out.println("StringBuffer concatenation time: " + (endSBuf - startSBuf) + " ns");

        // ---------------- File Reading and Word Counting ----------------
        String filePath = "largefile.txt"; // Replace with path to your large file

        // FileReader
        long startFR = System.nanoTime();
        int wordCountFR = countWordsFileReader(filePath);
        long endFR = System.nanoTime();
        System.out.println("FileReader word count: " + wordCountFR + ", Time: " + (endFR - startFR) + " ns");

        // InputStreamReader
        long startISR = System.nanoTime();
        int wordCountISR = countWordsInputStreamReader(filePath);
        long endISR = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCountISR + ", Time: " + (endISR - startISR) + " ns");
    }

    // ---------------- Count Words using FileReader ----------------
    private static int countWordsFileReader(String filePath) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split on whitespace
                count += words.length;
            }
        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }
        return count;
    }

    // ---------------- Count Words using InputStreamReader ----------------
    private static int countWordsInputStreamReader(String filePath) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader error: " + e.getMessage());
        }
        return count;
    }
}

