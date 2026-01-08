package com.linearandbinarysearch;

public class FirstNeg {

    // Method to find the index of first negative number
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return index of first negative
            }
        }
        return -1; // No negative number found
    }

    public static void main(String[] args) {

        int[] numbers = {4, 7, 0, 9, -3, -5, 8};

        int index = findFirstNegative(numbers);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}

