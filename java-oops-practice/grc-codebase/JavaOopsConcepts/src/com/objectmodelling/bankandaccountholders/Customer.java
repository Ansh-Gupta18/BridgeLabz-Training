package com.objectmodelling.bankandaccountholders;

public class Customer {

	private String customerName;
	
	Customer(String customerName){
		this.customerName = customerName;
	}
	public String getName() {
		return this.customerName;
	}
}
