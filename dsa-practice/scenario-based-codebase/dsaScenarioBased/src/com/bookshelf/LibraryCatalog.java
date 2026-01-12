package com.bookshelf;

import java.util.*;

public class  LibraryCatalog {

    // Genre → List of Books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // To avoid duplicate books
    private HashSet<Book> bookSet = new HashSet<>();

    // Add book
    public void addBook(String genre, Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Duplicate book not allowed: " + book);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        bookSet.add(book);

        System.out.println("Book added: " + book);
    }

    // Remove book
    public void removeBook(String genre, Book book) {
        if (catalog.containsKey(genre)) {
            LinkedList<Book> books = catalog.get(genre);
            if (books.remove(book)) {
                bookSet.remove(book);
                System.out.println("Book removed: " + book);
            } else {
                System.out.println("Book not found in genre");
            }
        }
    }

    // Display catalog
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println(" - " + book);
            }
        }
    }
}
