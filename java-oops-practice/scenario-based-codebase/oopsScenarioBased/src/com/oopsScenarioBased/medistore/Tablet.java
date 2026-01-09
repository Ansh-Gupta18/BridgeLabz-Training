package com.oopsScenarioBased.medistore;

import java.time.LocalDate;


public class Tablet extends Medicine{

	public Tablet(String name, int price, LocalDate expiryDate) {
		super(name, price, expiryDate);
		
	}
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(this.expiryDate);
		
	}

}
