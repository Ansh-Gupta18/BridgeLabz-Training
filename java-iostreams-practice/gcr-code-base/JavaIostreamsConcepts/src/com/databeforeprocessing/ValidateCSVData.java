package com.databeforeprocessing;



//File Name: ValidateCSVData.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

 // Regex patterns
 private static final String EMAIL_REGEX =
         "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
 private static final String PHONE_REGEX =
         "\\d{10}";

 public static void main(String[] args) {

     String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\databeforeprocessing\\users.csv";

     Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
     Pattern phonePattern = Pattern.compile(PHONE_REGEX);

     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

         String line;
         int rowNumber = 0;

         // Skip header
         br.readLine();

         while ((line = br.readLine()) != null) {
             rowNumber++;

             String[] data = line.split(",");

             String email = data[2];
             String phone = data[3];

             boolean valid = true;

             if (!emailPattern.matcher(email).matches()) {
                 System.out.println(" Invalid Email at row " + rowNumber + ": " + line);
                 valid = false;
             }

             if (!phonePattern.matcher(phone).matches()) {
                 System.out.println(" Invalid Phone Number at row " + rowNumber + ": " + line);
                 valid = false;
             }

             // If both are valid (optional info)
             if (valid) {
                 // System.out.println("✔ Valid row: " + line);
             }
         }

     } catch (IOException e) {
         System.out.println("Error reading CSV file: " + e.getMessage());
     }
 }
}

