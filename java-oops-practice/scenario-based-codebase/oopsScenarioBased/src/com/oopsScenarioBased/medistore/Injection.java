package com.oopsScenarioBased.medistore;

import java.time.LocalDate;


public class Injection extends Medicine{

	public Injection(String name, int price, LocalDate expiryDate) {
		super(name, price, expiryDate);
		
	}
	
	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(this.expiryDate.minusDays(20));
		
	}

}
