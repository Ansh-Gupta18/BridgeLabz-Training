package com.objectmodelling.ecommerceplatform;

public class CustomerMain {
    public static void main(String[] args) {
    	
    	//Create object of customer and order class
        Customers customer = new Customers();
        Order order = new Order();
        
        //Calling method to add product
        order.addProduct(new Product("Mobile"));
        order.addProduct(new Product("Laptop"));
        
        //Calling method to place order
        customer.placeOrder(order);
    }
}
