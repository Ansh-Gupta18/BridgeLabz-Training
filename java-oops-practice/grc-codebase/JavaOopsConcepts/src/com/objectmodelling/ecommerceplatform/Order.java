package com.objectmodelling.ecommerceplatform;

//Import ArrayList from java.util package
import java.util.ArrayList;
import java.util.List;

//Created a order class
public class Order {
	//Private instance of Order class
  private List<Product> products = new ArrayList<>();
  
  //public method to add product
  public void addProduct(Product product) {
      products.add(product);
  }
}
