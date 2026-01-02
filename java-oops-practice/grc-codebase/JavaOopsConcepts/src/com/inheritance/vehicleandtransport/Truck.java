package com.inheritance.vehicleandtransport;

public class Truck extends Vehicle{

	int numberOfTyre;
	
	Truck(int maxSpeed, String fuelType,int numberOfTyre) {
		super(maxSpeed, fuelType);
		this.numberOfTyre = numberOfTyre;
	}
	
	public void displayInfo() {
		System.out.println();
		System.out.println("Truck details : ");
		super.displayInfo();
		System.out.println("numberOfTyre : "+numberOfTyre);        
	}
}
