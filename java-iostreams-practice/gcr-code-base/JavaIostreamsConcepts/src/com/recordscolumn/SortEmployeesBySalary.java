package com.recordscolumn;



//File Name: SortEmployeesBySalary.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Employee {
 int id;
 String name;
 String department;
 int salary;

 Employee(int id, String name, String department, int salary) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }
}

public class SortEmployeesBySalary {

 public static void main(String[] args) {

     String filePath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\recordscolumn\\employees.csv";

     List<Employee> employees = new ArrayList<>();

     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

         String line;

         // Skip header
         br.readLine();

         while ((line = br.readLine()) != null) {

             String[] data = line.split(",");

             Employee emp = new Employee(
                     Integer.parseInt(data[0]),
                     data[1],
                     data[2],
                     Integer.parseInt(data[3])
             );

             employees.add(emp);
         }

     } catch (IOException e) {
         System.out.println("Error reading CSV file: " + e.getMessage());
     }

     // Sort by salary in descending order
     employees.sort((e1, e2) -> Integer.compare(e2.salary, e1.salary));

     System.out.println("Top 5 Highest-Paid Employees:\n");

     for (int i = 0; i < Math.min(5, employees.size()); i++) {
         Employee e = employees.get(i);
         System.out.println(
                 "ID: " + e.id +
                 ", Name: " + e.name +
                 ", Department: " + e.department +
                 ", Salary: " + e.salary
         );
     }
 }
}

