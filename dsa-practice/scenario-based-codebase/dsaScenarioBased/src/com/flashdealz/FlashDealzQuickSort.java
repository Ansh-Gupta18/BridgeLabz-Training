package com.oopsScenarioBased.flashdealz;

import java.util.Scanner;

class FlashDealzQuickSort {

    // Quick Sort function
    static void quickSort(int[] discounts, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(discounts, low, high);
            quickSort(discounts, low, pivotIndex - 1);
            quickSort(discounts, pivotIndex + 1, high);
        }
    }

    // Partition logic (Descending Order)
    static int partition(int[] discounts, int low, int high) {
        int pivot = discounts[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (discounts[j] > pivot) { // for top discounts first
                i++;
                int temp = discounts[i];
                discounts[i] = discounts[j];
                discounts[j] = temp;
            }
        }

        int temp = discounts[i + 1];
        discounts[i + 1] = discounts[high];
        discounts[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] discounts = new int[n];

        System.out.println("Enter discount percentages:");
        for (int i = 0; i < n; i++) {
            discounts[i] = sc.nextInt();
        }

        quickSort(discounts, 0, n - 1);

        System.out.println("Top Discounted Products:");
        for (int d : discounts) {
            System.out.print(d + "% ");
        }

        sc.close();
    }
}
