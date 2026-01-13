package com.oopsScenarioBased.bookshelf;

import java.util.*;

public class Library {
    HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // Add book
    void addBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        System.out.println("Added: " + book);
    }

    // Remove book
    void removeBook(String genre, Book book) {
        if (catalog.containsKey(genre)) {
            catalog.get(genre).remove(book);
            System.out.println("Removed: " + book);
        }
    }

    // Display books
    void display() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  " + b);
            }
        }
    }
}
