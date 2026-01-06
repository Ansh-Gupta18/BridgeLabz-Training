package com.oopsScenarioBased.swiftcart;

//SwiftCartApp.java
public class Main {
 public static void main(String[] args) {

     Cart cart = new Cart();

     Product milk = new PerishableProduct("Milk", 50, 2);
     Product rice = new NonPerishableProduct("Rice", 60, 5);

     cart.addProduct(milk);
     cart.addProduct(rice);

     cart.generateBill();
 }
}
