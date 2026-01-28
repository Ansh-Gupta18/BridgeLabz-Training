package com.generatereport;



//File Name: GenerateCSVReport.java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class GenerateCSVReport {

 // DB credentials
 private static final String DB_URL = "jdbc:mysql://localhost:3306/companydb";
 private static final String DB_USER = "root";
 private static final String DB_PASSWORD = "ansh@12345";

 public static void main(String[] args) {

     String outputFile = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\generatereport\\employees_report.csv";

     String query = "SELECT emp_id, name, department, salary FROM employees";

     try (
         Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query);
         BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
     ) {

         // Write CSV header
         bw.write("Employee ID,Name,Department,Salary");
         bw.newLine();

         // Write records
         while (rs.next()) {
             bw.write(
                 rs.getInt("emp_id") + "," +
                 rs.getString("name") + "," +
                 rs.getString("department") + "," +
                 rs.getInt("salary")
             );
             bw.newLine();
         }

         System.out.println("CSV report generated successfully: " + outputFile);

     } catch (SQLException | IOException e) {
         System.out.println("Error generating CSV report: " + ((Throwable) e).getMessage());
     }
 }
}

