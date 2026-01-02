package com.inheritance.vehicleandtransport;

public class Motorcycle extends Vehicle{

	String companyName;
	
	Motorcycle(int maxSpeed, String fuelType,String companyName) {
		super(maxSpeed, fuelType);
		this.companyName = companyName;
	}
	public void displayInfo() {
		System.out.println();
		System.out.println("Motorcycle details : ");
		super.displayInfo();
		System.out.println("Company Name : "+companyName);
        
	}
}
