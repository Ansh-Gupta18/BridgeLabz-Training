package com.oopsScenarioBased.eduresults;

import java.util.Scanner;

public class EduResultsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        System.out.println("\nEnter student details (already sorted district-wise):");
        for (int i = 0; i < n; i++) {
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(roll, name, marks);
        }

        // Merge Sort for Rank List
        MergeSort.sort(students, 0, n - 1);

        System.out.println("\n🏆 State-wise Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + " → " + s);
        }

        sc.close();
    }
}

