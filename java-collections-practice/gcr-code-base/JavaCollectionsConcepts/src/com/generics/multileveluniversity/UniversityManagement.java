package com.generics.multileveluniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<CourseType> courseList = new ArrayList<>();

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {

            System.out.println("\nChoose Course Type:");
            System.out.println("1. Exam-Based");
            System.out.println("2. Assignment-Based");
            System.out.println("3. Research-Based");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter course name: ");
            String name = sc.nextLine();

            switch (choice) {
                case 1:
                    courseList.add(new ExamCourse(name));
                    break;
                case 2:
                    courseList.add(new AssignmentCourse(name));
                    break;
                case 3:
                    courseList.add(new ResearchCourse(name));
                    break;
                default:
                    System.out.println("Invalid choice!");
                    i--; // repeat this iteration
            }
        }

        System.out.println("\n📚 University Course List:");
        CourseUtil.displayCourses(courseList);

        sc.close();
    }
}

