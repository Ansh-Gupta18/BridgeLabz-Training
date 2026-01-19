package com.oopsScenarioBased.smartlibrary;

import java.util.Scanner;

public class SmartLibrary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of borrowed books: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        String[] books = new String[n];

        System.out.println("\nEnter book titles:");

        for (int i = 0; i < n; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();

            // Sort after each insertion
            InsertionSort.sort(books, i + 1);
        }

        System.out.println("\n📖 Borrowed Books (Alphabetically Sorted):");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i]);
        }

        sc.close();
    }
}
