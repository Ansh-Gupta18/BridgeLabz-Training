package com.binarysearchtree;

import java.util.Map;
import java.util.TreeMap;

public class ProductInventory {

    // SKU -> Product Details
    private TreeMap<Integer, Product> inventory = new TreeMap<>();

    // Product class (inner class)
    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " | ₹" + price;
        }
    }

    // 🔹 Scenario 1: Lookup by SKU
    public void lookupProduct(int sku) {
        if (inventory.containsKey(sku)) {
            System.out.println("Product Found: SKU " + sku + " -> " + inventory.get(sku));
        } else {
            System.out.println("Product not found!");
        }
    }

    // 🔹 Scenario 2: Price Update
    public void updatePrice(int sku, double newPrice) {
        if (inventory.containsKey(sku)) {
            inventory.get(sku).price = newPrice;
            System.out.println("Price updated for SKU " + sku);
        } else {
            System.out.println("Cannot update. Product not found!");
        }
    }

    // Add Product
    public void addProduct(int sku, String name, double price) {
        inventory.put(sku, new Product(name, price));
        System.out.println("Product added: SKU " + sku);
    }

    // 🔹 Scenario 3: Sorted List Display
    public void displaySortedProducts() {
        System.out.println("\nProducts Sorted by SKU:");
        for (Map.Entry<Integer, Product> entry : inventory.entrySet()) {
            System.out.println("SKU: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Main Method
    public static void main(String[] args) {
        ProductInventory store = new ProductInventory();

        // Add Products
        store.addProduct(3002, "Laptop", 65000);
        store.addProduct(3001, "Mobile", 25000);
        store.addProduct(3003, "Headphones", 3000);

        // Lookup
        store.lookupProduct(3001);

        // Update Price
        store.updatePrice(3003, 2800);

        // Display Sorted Inventory
        store.displaySortedProducts();
    }
}

