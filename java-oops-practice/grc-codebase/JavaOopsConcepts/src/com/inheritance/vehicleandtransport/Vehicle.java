package com.inheritance.vehicleandtransport;

public class Vehicle {
	
	int maxSpeed;
	String fuelType;
	
	
	Vehicle(int maxSpeed,String fuelType){
		this.fuelType = fuelType;
		this.maxSpeed= maxSpeed;
	}
	
	public void displayInfo() {
		System.out.println("Fuel Type : "+fuelType);
		System.out.println("Max Speed : "+maxSpeed);
	}

}
