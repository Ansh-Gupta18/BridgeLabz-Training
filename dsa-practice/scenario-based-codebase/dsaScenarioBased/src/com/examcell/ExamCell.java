package com.examcell;

import java.util.Scanner;

public class ExamCell {

    // Merge Sort function
    static void mergeSort(int[] scores, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(scores, left, mid);
            mergeSort(scores, mid + 1, right);

            merge(scores, left, mid, right);
        }
    }

    // Merge two sorted halves
    static void merge(int[] scores, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = scores[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = scores[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge arrays
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {   // higher score = better rank
                scores[k++] = L[i++];
            } else {
                scores[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1)
            scores[k++] = L[i++];

        while (j < n2)
            scores[k++] = R[j++];
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter student scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        mergeSort(scores, 0, n - 1);

        System.out.println("\nState-Level Rank List:");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + " : " + scores[i]);
        }

        sc.close();
    }
}
