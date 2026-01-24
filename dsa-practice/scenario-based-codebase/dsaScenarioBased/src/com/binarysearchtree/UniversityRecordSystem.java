package com.binarysearchtree;

import java.util.Map;
import java.util.TreeMap;

public class UniversityRecordSystem {

    // TreeMap to store rollNumber -> Student Details
    private TreeMap<Integer, String> records = new TreeMap<>();

    // 🔹 Scenario 1: Insertion
    public void insertStudent(int rollNo, String details) {
        records.put(rollNo, details);
        System.out.println("Student inserted: Roll No " + rollNo);
    }

    // 🔹 Scenario 2: Deletion
    public void deleteStudent(int rollNo) {
        if (records.remove(rollNo) != null) {
            System.out.println("Student deleted: Roll No " + rollNo);
        } else {
            System.out.println("Student not found!");
        }
    }

    // 🔹 Scenario 3: Search
    public void searchStudent(int rollNo) {
        if (records.containsKey(rollNo)) {
            System.out.println("Found: " + rollNo + " -> " + records.get(rollNo));
        } else {
            System.out.println("Student not found!");
        }
    }

    // 🔹 Scenario 3: Sorted Display
    public void displayAllStudents() {
        System.out.println("\nSorted Student Records:");
        for (Map.Entry<Integer, String> entry : records.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }

    // Main Method
    public static void main(String[] args) {
        UniversityRecordSystem system = new UniversityRecordSystem();

        // Insertion
        system.insertStudent(102, "Ansh Gupta - CSE");
        system.insertStudent(101, "Rahul Verma - IT");
        system.insertStudent(103, "Priya Sharma - ECE");

        // Search
        system.searchStudent(101);

        // Deletion
        system.deleteStudent(102);

        // Display Sorted Records
        system.displayAllStudents();
    }
}

