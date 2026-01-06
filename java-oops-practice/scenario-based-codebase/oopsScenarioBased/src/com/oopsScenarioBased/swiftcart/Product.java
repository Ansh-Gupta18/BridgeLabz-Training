package com.oopsScenarioBased.swiftcart;

//Product.java
public abstract class Product {
 private String name;
 private double price;
 private String category;
 private int quantity;

 public Product(String name, double price, String category, int quantity) {
     this.name = name;
     this.price = price;
     this.category = category;
     this.quantity = quantity;
 }

 // Encapsulation: getters only (no setter for price)
 public double getPrice() {
     return price;
 }

 public int getQuantity() {
     return quantity;
 }

 public String getName() {
     return name;
 }

 // Price * quantity
 public double getTotalPrice() {
     return price * quantity;
 }

 // Polymorphism: each product decides its discount
 public abstract double getDiscount();
}
