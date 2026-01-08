package com.linearandbinarysearch;

import java.util.Arrays;

public class SearchChallenge {

    // Linear Search: Find first missing positive integer
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Mark numbers outside 1..n as n+1
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark visited numbers by negating index
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // Step 3: First positive index + 1 is the missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1; // All numbers 1..n are present
    }

    // Binary Search: Find index of target in sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};
        int target = 4;

        // Linear Search: First missing positive
        int missing = firstMissingPositive(Arrays.copyOf(nums, nums.length));
        System.out.println("First missing positive: " + missing);

        // Binary Search: Find target index
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int index = binarySearch(sorted, target);
        System.out.println("Index of " + target + " in sorted array: " + index);
    }
}
