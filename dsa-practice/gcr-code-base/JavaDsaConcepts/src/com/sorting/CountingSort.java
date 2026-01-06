package com.sorting;

public class CountingSort {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Step 1: Count frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Calculate cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements into output array
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy output array to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {15, 12, 18, 10, 14, 12, 16, 11};

        countingSort(studentAges);

        System.out.println("Sorted Student Ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}
