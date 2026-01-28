package com.datacsv;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\datacsv\\employees.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            // Write CSV header
            writer.append("ID,Name,Department,Salary\n");

            // Write employee records
            writer.append("101,Ansh,IT,55000\n");
            writer.append("102,Ritika,HR,48000\n");
            writer.append("103,Rahul,Finance,60000\n");
            writer.append("104,Priya,Marketing,52000\n");
            writer.append("105,Aman,Operations,50000\n");

            System.out.println("Employee data written to CSV file successfully!");

        } catch (IOException e) {
            System.out.println("❌ Error writing CSV file");
            e.printStackTrace();
        }
    }
}

