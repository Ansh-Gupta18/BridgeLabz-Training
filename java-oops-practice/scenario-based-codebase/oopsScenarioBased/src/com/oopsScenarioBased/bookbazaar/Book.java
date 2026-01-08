package com.oopsScenarioBased.bookbazaar;

class Book implements IDiscountable {
    protected String title;
    protected String author;
    protected double price;
    private int stock;   // encapsulated

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Constructor with default stock
    public Book(String title, String author, double price) {
        this(title, author, price, 10);
    }

    public int getStock() {
        return stock;
    }

    // Inventory update only via method
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Insufficient stock!");
        }
    }

    @Override
    public double applyDiscount(int quantity) {
        return 0; // No discount for generic book
    }
}
