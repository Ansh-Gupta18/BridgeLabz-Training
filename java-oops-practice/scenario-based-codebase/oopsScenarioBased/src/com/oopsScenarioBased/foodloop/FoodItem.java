package com.oopsScenarioBased.foodloop;

public class FoodItem {

    String name;
    String category;
    double price;
    private int stock;   // encapsulation (hidden)

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock() {
        stock--;
    }
}
