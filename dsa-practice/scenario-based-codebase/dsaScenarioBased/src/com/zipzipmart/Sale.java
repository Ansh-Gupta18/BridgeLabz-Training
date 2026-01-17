package com.zipzipmart;

import java.util.Scanner;

class Sale {
    String date;   // format: YYYY-MM-DD
    double amount;

    // Constructor
    Sale(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }
}

class ZipZipMart {

    // Merge Sort function
    static void mergeSort(Sale[] sales, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Divide the array
            mergeSort(sales, left, mid);
            mergeSort(sales, mid + 1, right);

            // Merge sorted halves
            merge(sales, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    static void merge(Sale[] sales, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Sale[] L = new Sale[n1];
        Sale[] R = new Sale[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = sales[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = sales[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge while maintaining stability
        while (i < n1 && j < n2) {
            if (L[i].date.compareTo(R[j].date) < 0 ||
               (L[i].date.equals(R[j].date) && L[i].amount <= R[j].amount)) {

                sales[k] = L[i];
                i++;
            } else {
                sales[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            sales[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            sales[k] = R[j];
            j++;
            k++;
        }
    }

    // Display sales records
    static void display(Sale[] sales) {
        for (Sale s : sales) {
            System.out.println("Date: " + s.date + " | Amount: " + s.amount);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sales records: ");
        int n = sc.nextInt();

        Sale[] sales = new Sale[n];

        // Taking user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter date (YYYY-MM-DD): ");
            String date = sc.next();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            sales[i] = new Sale(date, amount);
        }

        // Sorting using Merge Sort
        mergeSort(sales, 0, n - 1);

        System.out.println("\nSorted Sales Report:");
        display(sales);

        sc.close();
    }
}

