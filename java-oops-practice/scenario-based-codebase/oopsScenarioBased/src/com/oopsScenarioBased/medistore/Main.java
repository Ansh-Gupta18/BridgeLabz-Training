package com.oopsScenarioBased.medistore;

import java.time.LocalDate;

public class Main {

	public static void main(String args[]) {
	Medicine m1 = new Medicine("Paracitamol",5,LocalDate.of(2025, 5, 10));
	Medicine m2 = new Medicine("Cough syrup",120,LocalDate.of(2026, 5, 10));
    m1.sell(10);
	if(m1.checkExpiry()) {
		System.out.println("Medicine expired");
	}
	else {
		System.out.println("Medicine not Expired");
	}
	m2.sell(5);
	if(m2.checkExpiry()) {
		System.out.println("Medicine expired");
	}
	else {
		System.out.println("Medicine not Expired");
	}
}
}