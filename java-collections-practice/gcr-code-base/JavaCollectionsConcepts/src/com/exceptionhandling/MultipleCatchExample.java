package com.exceptionhandling;

import java.util.Scanner;

public class MultipleCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Accept array size
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = null;

            // Initialize array only if size > 0
            if (size > 0) {
                arr = new int[size];
                System.out.println("Enter " + size + " elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            // Accept index
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            // Access array element
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");

        } finally {
            sc.close();
        }
    }
}

