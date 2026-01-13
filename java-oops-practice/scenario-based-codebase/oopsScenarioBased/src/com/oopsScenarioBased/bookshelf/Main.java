package com.oopsScenarioBased.bookshelf;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Data Structures", "Mark");
        Book b3 = new Book("Harry Potter", "J.K Rowling");

        lib.addBook("Programming", b1);
        lib.addBook("Programming", b2);
        lib.addBook("Fiction", b3);

        lib.display();

        lib.removeBook("Programming", b1);

        lib.display();
    }
}

