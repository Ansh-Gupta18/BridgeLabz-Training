package com.smartshelf;
import java.util.Scanner;

class SmartShelfAlt {

    // Insert a new book title into its correct position
    static void insertBook(String[] books, int count) {

        String key = books[count];
        int j = count - 1;

        // Shift titles until correct position is found
        while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
            books[j + 1] = books[j];
            j--;
        }

        books[j + 1] = key;
    }

    // Display current shelf state
    static void display(String[] books, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] books = new String[n];

        // Real-time insertion and sorting
        for (int i = 0; i < n; i++) {

            System.out.print("Enter book title: ");
            books[i] = sc.nextLine();

            // Insert the newly added book in sorted order
            insertBook(books, i);

            System.out.println("\nShelf after adding book:");
            display(books, i);
            System.out.println("--------------------");
        }

        sc.close();
    }
}
