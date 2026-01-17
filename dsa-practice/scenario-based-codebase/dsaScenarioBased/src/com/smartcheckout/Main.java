package com.smartcheckout;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Store store = new Store();
		store.addItem("Milk", 50, 10);
		store.addItem("bread", 30, 10);
		
		CheckoutCounter counter = new CheckoutCounter();
		
		Customer c1 = new Customer("Ansh" , Arrays.asList("Milk", "Bread"));
		Customer c2 = new Customer("Karan" , Arrays.asList("Milk"));
		
		counter.addCustomer(c1);
        counter.addCustomer(c2);
        
		Customer current;
		
		while((current = counter.nextCustomer()) != null) {
			Billing.processBill(current, store);
		}
	}
}
