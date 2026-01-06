package com.oopsScenarioBased.swiftcart;

//NonPerishableProduct.java
public class NonPerishableProduct extends Product {

 public NonPerishableProduct(String name, double price, int quantity) {
     super(name, price, "Non-Perishable", quantity);
 }

 @Override
 public double getDiscount() {
     return getTotalPrice() * 0.10; // 10% discount
 }
}
