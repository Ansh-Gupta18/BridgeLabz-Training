package com.oopsScenarioBased.swiftcart;

//PerishableProduct.java
public class PerishableProduct extends Product {

 public PerishableProduct(String name, double price, int quantity) {
     super(name, price, "Perishable", quantity);
 }

 // Higher discount for perishable items
 @Override
 public double getDiscount() {
     return getTotalPrice() * 0.20; // 20% discount
 }
}

