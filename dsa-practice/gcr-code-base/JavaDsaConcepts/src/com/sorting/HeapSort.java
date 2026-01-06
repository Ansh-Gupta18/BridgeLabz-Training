package com.sorting;

import java.util.Scanner;

public class HeapSort {

    // Heapify a subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;        // Initialize largest as root
        int left = 2 * i + 1;   // Left child
        int right = 2 * i + 2;  // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Heap Sort function
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of job applicants
        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();

        int[] salaries = new int[n];

        // Input expected salaries
        System.out.println("Enter expected salaries:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        // Apply Heap Sort
        heapSort(salaries);

        // Display sorted salaries
        System.out.println("Sorted Salary Demands (Ascending Order):");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        sc.close();
    }
}
