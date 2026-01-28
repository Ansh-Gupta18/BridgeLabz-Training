package com.count;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\count\\student.csv";
        int recordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.readLine(); // 🔹 Skip header row
            String line;

            while ((line = br.readLine()) != null) {
                recordCount++;
            }

            System.out.println("Total number of records (excluding header): " + recordCount);

        } catch (IOException e) {
            System.out.println("Error reading the CSV file: " + e.getMessage());
        }
    }
}
