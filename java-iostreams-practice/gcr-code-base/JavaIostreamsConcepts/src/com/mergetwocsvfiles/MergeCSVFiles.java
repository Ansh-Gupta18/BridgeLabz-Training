package com.mergetwocsvfiles;



//File Name: MergeCSVFiles.java
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

 public static void main(String[] args) {

     String file1 = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\mergetwocsvfiles\\students1.csv";
     String file2 = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\mergetwocsvfiles\\students2.csv";
     String outputFile = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\mergetwocsvfiles\\students_merged.csv";

     Map<String, String> studentMap = new HashMap<>();

     // Step 1: Read students1.csv
     try (BufferedReader br = new BufferedReader(new FileReader(file1))) {

         String line;
         br.readLine(); // skip header

         while ((line = br.readLine()) != null) {
             String[] data = line.split(",");
             // ID -> Name,Age
             studentMap.put(data[0], data[1] + "," + data[2]);
         }

     } catch (IOException e) {
         System.out.println("Error reading students1.csv: " + e.getMessage());
     }

     // Step 2: Read students2.csv and merge
     try (
         BufferedReader br = new BufferedReader(new FileReader(file2));
         BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
     ) {

         // Write header
         bw.write("ID,Name,Age,Marks,Grade");
         bw.newLine();

         String line;
         br.readLine(); // skip header

         while ((line = br.readLine()) != null) {

             String[] data = line.split(",");
             String id = data[0];

             if (studentMap.containsKey(id)) {
                 // ID,Name,Age,Marks,Grade
                 bw.write(id + "," + studentMap.get(id) + "," + data[1] + "," + data[2]);
                 bw.newLine();
             }
         }

         System.out.println("CSV files merged successfully!");

     } catch (IOException e) {
         System.out.println("Error merging CSV files: " + e.getMessage());
     }
 }
}

