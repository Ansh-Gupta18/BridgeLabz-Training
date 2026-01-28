package com.searchforrecord;


//File Name: SearchEmployeeCSV.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployeeCSV {

 public static void main(String[] args) {

     String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\searchforrecord\\employees.csv";
     String searchName = "Ritika"; // employee to search

     boolean found = false;

     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

         String line;

         // Skip header
         br.readLine();

         while ((line = br.readLine()) != null) {

             String[] data = line.split(",");

             String name = data[1];

             if (name.equalsIgnoreCase(searchName)) {

                 System.out.println("Employee Found:");
                 System.out.println("Name       : " + name);
                 System.out.println("Department : " + data[2]);
                 System.out.println("Salary     : " + data[3]);

                 found = true;
                 break;
             }
         }

         if (!found) {
             System.out.println("Employee not found: " + searchName);
         }

     } catch (IOException e) {
         System.out.println("Error reading CSV file: " + e.getMessage());
     }
 }
}

