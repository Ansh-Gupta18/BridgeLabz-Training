package com.oopsScenarioBased.bookbazaar;

public class Main {
    public static void main(String[] args) {

        Book ebook = new EBook("Java Mastery", "James Gosling", 500);
        Book printedBook = new PrintedBook("Clean Code", "Robert Martin", 700, 5);

        Order order1 = new Order("ORD101", "Ansh", ebook, 2);
        Order order2 = new Order("ORD102", "Ansh", printedBook, 3);

        order1.confirmOrder();
        order2.confirmOrder();

        order1.displayOrder();
        System.out.println();
        order2.displayOrder();
    }
}
