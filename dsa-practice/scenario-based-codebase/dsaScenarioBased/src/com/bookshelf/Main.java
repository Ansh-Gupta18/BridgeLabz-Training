package com.bookshelf;

public class Main {
    public static void main(String[] args) {

        LibraryCatalog library = new LibraryCatalog();

        Book b1 = new Book(101, "Clean Code", "Robert Martin");
        Book b2 = new Book(102, "Effective Java", "Joshua Bloch");
        Book b3 = new Book(103, "Harry Potter", "J.K. Rowling");

        library.addBook("Programming", b1);
        library.addBook("Programming", b2);
        library.addBook("Fantasy", b3);

        // Duplicate test
        library.addBook("Programming", b1);

        library.displayCatalog();

        // Borrow / Remove
        library.removeBook("Programming", b2);

        library.displayCatalog();
    }
}
 
