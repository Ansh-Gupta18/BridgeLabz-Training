package com.readcsvfile;


//File Name: ReadLargeCSV.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSV {

 private static final int BATCH_SIZE = 100;

 public static void main(String[] args) {

     String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\readcsvfile\\bigfile.csv";
     int totalRecords = 0;

     List<String> batch = new ArrayList<>(BATCH_SIZE);

     try (BufferedReader br = new BufferedReader(new FileReader(filePath), 8 * 1024)) {
         // 8KB buffer (you can increase to 64KB or more)

         String line;

         // Skip header
         br.readLine();

         while ((line = br.readLine()) != null) {

             batch.add(line);

             if (batch.size() == BATCH_SIZE) {
                 processBatch(batch);
                 totalRecords += batch.size();
                 batch.clear(); // 🔥 very important
             }
         }

         // Process remaining lines (if any)
         if (!batch.isEmpty()) {
             processBatch(batch);
             totalRecords += batch.size();
             batch.clear();
         }

         System.out.println("Total records processed: " + totalRecords);

     } catch (IOException e) {
         System.out.println("Error reading large CSV file: " + e.getMessage());
     }
 }

 // Simulate processing logic
 private static void processBatch(List<String> batch) {
     // Example: just printing batch size
     System.out.println("Processed batch of size: " + batch.size());

     // Real use cases:
     // - DB insert
     // - validation
     // - transformation
     // - aggregation
 }
}
