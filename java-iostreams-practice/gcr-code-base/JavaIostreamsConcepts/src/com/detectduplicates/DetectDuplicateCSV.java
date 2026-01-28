package com.detectduplicates;



//File Name: DetectDuplicateCSV.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

 public static void main(String[] args) {

     String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\detectduplicates\\students.csv";

     Set<String> seenIds = new HashSet<>();

     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

         String line;

         // Skip header
         br.readLine();

         System.out.println("Duplicate Records:\n");

         while ((line = br.readLine()) != null) {

             String[] data = line.split(",");
             String id = data[0];

             if (!seenIds.add(id)) {
                 // add() returns false if ID already exists
                 System.out.println(line);
             }
         }

     } catch (IOException e) {
         System.out.println("Error reading CSV file: " + e.getMessage());
     }
 }
}

