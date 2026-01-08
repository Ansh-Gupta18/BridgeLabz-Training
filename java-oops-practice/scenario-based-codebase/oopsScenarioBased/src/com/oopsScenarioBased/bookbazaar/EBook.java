package com.oopsScenarioBased.bookbazaar;

class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE);
    }

    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.20; // 20% discount
    }
}
