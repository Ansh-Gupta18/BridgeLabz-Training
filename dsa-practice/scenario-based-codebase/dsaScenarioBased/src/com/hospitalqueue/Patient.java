package com.hospitalqueue;

import java.util.Scanner;

class Patient {
    String name;
    int criticality;

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }
}

class HospitalQueue {

    static void bubbleSort(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    static void display(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.name + " - Criticality: " + p.criticality);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter patient name: ");
            String name = sc.next();

            System.out.print("Enter criticality (1-10): ");
            int criticality = sc.nextInt();

            patients[i] = new Patient(name, criticality);
        }

        bubbleSort(patients);

        System.out.println("\nSorted Patients by Criticality:");
        display(patients);

        sc.close();
    }
}
