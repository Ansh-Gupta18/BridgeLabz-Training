package com.dataintojavaobjects;



//File Name: CSVToStudent.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudent {

 public static void main(String[] args) {

     String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\dataintojavaobjects\\students.csv";

     List<Student> students = new ArrayList<>();

     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

         String line;

         // Skip header
         br.readLine();

         while ((line = br.readLine()) != null) {

             String[] data = line.split(",");

             Student student = new Student(
                     Integer.parseInt(data[0]),
                     data[1],
                     Integer.parseInt(data[2]),
                     Integer.parseInt(data[3])
             );

             students.add(student);
         }

     } catch (IOException e) {
         System.out.println("Error reading CSV file: " + e.getMessage());
     }

     // Print all students
     System.out.println("Student List:\n");
     for (Student s : students) {
         System.out.println(s);
     }
 }
}

