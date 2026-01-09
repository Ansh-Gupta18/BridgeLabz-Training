package com.oopsScenarioBased.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine{

	public Syrup(String name, int price, LocalDate expiryDate) {
		super(name, price, expiryDate);
		
	}
	
	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(this.expiryDate.minusDays(10));
		
	}

}
