package com.readacsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\readacsv\\students.csv"; // CSV file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                System.out.println("Student ID   : " + id);
                System.out.println("Name         : " + name);
                System.out.println("Age          : " + age);
                System.out.println("Marks        : " + marks);
                System.out.println("---------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}

