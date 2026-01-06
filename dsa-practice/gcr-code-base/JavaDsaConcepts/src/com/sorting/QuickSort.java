package com.sorting;

import java.util.Scanner;

public class QuickSort {

    // Partition method (using last element as pivot)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // Pivot element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort left and right parts
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input product prices
        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Apply Quick Sort
        quickSort(prices, 0, n - 1);

        // Display sorted prices
        System.out.println("Sorted Product Prices (Ascending Order):");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}
