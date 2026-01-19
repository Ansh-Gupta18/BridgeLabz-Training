package com.oopsScenarioBased.fitnesstracker;

import java.util.Scanner;

class FitnessTrackerBubbleSort {

    static void bubbleSort(int[] steps) {
        int n = steps.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (steps[j] < steps[j + 1]) { // Descending order
                    int temp = steps[j];
                    steps[j] = steps[j + 1];
                    steps[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();

        int[] steps = new int[n];

        System.out.println("Enter daily step counts:");
        for (int i = 0; i < n; i++) {
            steps[i] = sc.nextInt();
        }

        bubbleSort(steps);

        System.out.println("Daily Step Ranking:");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + steps[i] + " steps");
        }

        sc.close();
    }
}

