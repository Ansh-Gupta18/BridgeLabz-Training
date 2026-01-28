package com.records;



//File Name: FilterCSVRecords.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSVRecords {

 public static void main(String[] args) {

     String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\count\\student.csv";

     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

         String line;

         // Skip header
         br.readLine();

         System.out.println("Students scoring more than 80 marks:\n");

         while ((line = br.readLine()) != null) {

             String[] data = line.split(",");

             int marks = Integer.parseInt(data[3]);

             if (marks > 80) {
                 System.out.println(
                     "ID: " + data[0] +
                     ", Name: " + data[1] +
                     ", Age: " + data[2] +
                     ", Marks: " + data[3]
                 );
             }
         }

     } catch (IOException e) {
         System.out.println("Error reading CSV file: " + e.getMessage());
     }
 }
}

