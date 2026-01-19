package com.oopsScenarioBased.icecreamrush;

import java.util.Scanner;

public class IceCreamRush {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 8;
        String[] flavors = new String[n];
        int[] sales = new int[n];

        System.out.println("Enter Ice Cream Flavor Names and Weekly Sales:");

        for (int i = 0; i < n; i++) {
            System.out.print("Flavor " + (i + 1) + " name: ");
            flavors[i] = sc.nextLine();

            System.out.print("Sales count: ");
            sales[i] = sc.nextInt();
            sc.nextLine(); // clear buffer
        }

        // Sorting using Bubble Sort
        BubbleSort.sort(flavors, sales);

        System.out.println("\n Flavors Sorted by Popularity (Least → Most):");
        for (int i = 0; i < n; i++) {
            System.out.println(flavors[i] + " - " + sales[i] + " sales");
        }

        sc.close();
    }
}
