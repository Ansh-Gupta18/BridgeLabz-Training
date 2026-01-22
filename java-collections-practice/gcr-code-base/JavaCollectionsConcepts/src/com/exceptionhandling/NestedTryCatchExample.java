package com.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Accept array size and elements
            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Accept index and divisor
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            // Outer try: array access
            try {
                int value = arr[index];

                // Inner try: division
                try {
                    int result = value / divisor;
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            sc.close();
        }
    }
}

