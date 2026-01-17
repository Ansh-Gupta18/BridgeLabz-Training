package com.cropmonitor;

import java.util.Scanner;

public class CropMonitor {

    // Quick Sort by timestamp
    static void quickSort(long[] timestamps, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(timestamps, low, high);
            quickSort(timestamps, low, pivotIndex - 1);
            quickSort(timestamps, pivotIndex + 1, high);
        }
    }

    // Partition logic
    static int partition(long[] timestamps, int low, int high) {
        long pivot = timestamps[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (timestamps[j] < pivot) {
                i++;
                long temp = timestamps[i];
                timestamps[i] = timestamps[j];
                timestamps[j] = temp;
            }
        }

        long temp = timestamps[i + 1];
        timestamps[i + 1] = timestamps[high];
        timestamps[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        long[] timestamps = new long[n];

        System.out.println("Enter timestamps (epoch or sequence numbers):");
        for (int i = 0; i < n; i++) {
            timestamps[i] = sc.nextLong();
        }

        quickSort(timestamps, 0, n - 1);

        System.out.println("\nSensor Data Sorted by Timestamp:");
        for (long time : timestamps) {
            System.out.print(time + " ");
        }

        sc.close();
    }
}
