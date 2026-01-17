package com.cinemahouse;

import java.util.Scanner;

public class CinemaHouse {

    // Bubble Sort logic
    static void bubbleSort(int[] times, int n) {

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (times[j] > times[j + 1]) {
                    // swap
                    int temp = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = temp;
                    swapped = true;
                }
            }

            // Stop if already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movie shows: ");
        int n = sc.nextInt();

        int[] showTimes = new int[n];

        System.out.println("Enter show times (in 24-hour format, e.g., 1400):");
        for (int i = 0; i < n; i++) {
            showTimes[i] = sc.nextInt();
        }

        bubbleSort(showTimes, n);

        System.out.println("\nSorted Movie Show Times:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }

        sc.close();
    }
}
