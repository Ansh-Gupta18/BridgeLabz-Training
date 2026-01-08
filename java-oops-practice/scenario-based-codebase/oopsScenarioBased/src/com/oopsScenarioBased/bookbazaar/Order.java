package com.oopsScenarioBased.bookbazaar;

class Order {
    private String orderId;
    private String userName;
    private String status; // restricted access
    private Book book;
    private int quantity;

    public Order(String orderId, String userName, Book book, int quantity) {
        this.orderId = orderId;
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
        this.status = "PLACED";
    }

    // Restricted order status update
    protected void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public double calculateTotal() {
        double totalPrice = book.price * quantity;   // operator usage
        double discount = book.applyDiscount(quantity);
        return totalPrice - discount;
    }

    public void confirmOrder() {
        if (quantity <= book.getStock()) {
            book.reduceStock(quantity);
            updateStatus("CONFIRMED");
        } else {
            updateStatus("FAILED");
        }
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("User: " + userName);
        System.out.println("Total Amount: ₹" + calculateTotal());
        System.out.println("Order Status: " + status);
    }
}

