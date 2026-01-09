package com.oopsScenarioBased.foodloop;

import java.util.ArrayList;

public class Order implements IOrderable {

    ArrayList<FoodItem> items = new ArrayList<>();
    double total;

    // Constructor for combo meals
    public Order(FoodItem item1, FoodItem item2) {
        items.add(item1);
        items.add(item2);
        calculateTotal();
    }

    public void addItem(FoodItem item) {
        items.add(item);
        calculateTotal();
    }

    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.price;   // operator usage
        }
        total -= applyDiscount();  // discount
    }

    // Polymorphism
    public double applyDiscount() {
        if (total > 500)
            return total * 0.10;
        else
            return total * 0.05;
    }

    public void placeOrder() {
        System.out.println("Order placed. Total = " + total);
    }

    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}

