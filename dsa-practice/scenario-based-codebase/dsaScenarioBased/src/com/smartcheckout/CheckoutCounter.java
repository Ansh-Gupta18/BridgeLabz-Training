package com.smartcheckout;

import java.util.*;

public class CheckoutCounter {

	Queue<Customer> queue = new LinkedList<>();
	
	void addCustomer(Customer c) {
		queue.add(c);
		System.out.println(c.name +" added to queue");
	}
	
	Customer nextCustomer() {
		return queue.poll();
	}
}
