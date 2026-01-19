package com.aidrivenresume;

import java.util.*;

public class ResumeScreeningSystem {

    // Wildcard usage
    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            Resume<JobRole> resume = new Resume<>(role);
            resume.screenResume();
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<JobRole> candidates = new ArrayList<>();

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Software Engineer");
            System.out.println("2. Data Scientist");
            System.out.println("3. Product Manager");
            System.out.print("Select role: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter experience: ");
            int exp = sc.nextInt();

            switch (choice) {
                case 1 -> candidates.add(new SoftwareEngineer(name, exp));
                case 2 -> candidates.add(new DataScientist(name, exp));
                case 3 -> candidates.add(new ProductManager(name, exp));
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("\n=== AI Resume Screening Result ===");
        processResumes(candidates);
        sc.close();
    }
}

