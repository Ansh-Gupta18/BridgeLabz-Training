package com.oopsScenarioBased.swiftcart;
//Cart.java
import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

 private List<Product> products;
 private double totalPrice;

 // Empty cart
 public Cart() {
     products = new ArrayList<>();
 }

 // Cart with pre-selected items
 public Cart(List<Product> products) {
     this.products = products;
     calculateTotal();
 }

 public void addProduct(Product product) {
     products.add(product);
     calculateTotal();
 }

 // Only Cart can update total price
 private void calculateTotal() {
     totalPrice = 0;
     for (Product p : products) {
         totalPrice += p.getTotalPrice();
     }
 }

 @Override
 public void applyDiscount() {
     double discount = 0;
     for (Product p : products) {
         discount += p.getDiscount();
     }
     totalPrice = totalPrice - discount;
 }

 @Override
 public void generateBill() {
     applyDiscount();
     System.out.println("🛒 SwiftCart Bill");
     for (Product p : products) {
         System.out.println(p.getName() + " = ₹" + p.getTotalPrice());
     }
     System.out.println("Final Amount: ₹" + totalPrice);
 }
}

