package com.robowarehouse;

import java.util.Scanner;

public class RoboWarehouse {

    // Insertion Sort logic
    static void insertionSort(int[] weights, int n) {

        for (int i = 1; i < n; i++) {
            int current = weights[i];
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && weights[j] > current) {
                weights[j + 1] = weights[j];
                j--;
            }

            // Insert current package at correct position
            weights[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weights = new int[n];

        System.out.println("Enter package weights one by one:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();

            // Sort after each insertion (streaming behavior)
            insertionSort(weights, i + 1);

            System.out.print("Shelf state after insertion: ");
            for (int j = 0; j <= i; j++) {
                System.out.print(weights[j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
