package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {

    public static void main(String[] args) {

        // Check if file path is provided
        if (args.length == 0) {
            System.out.println("Usage: java ReadLargeFile <file-path>");
            return;
        }

        String filePath = args[0];

        // Try-with-resources ensures file is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {
                // Case-insensitive check for "error"
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

