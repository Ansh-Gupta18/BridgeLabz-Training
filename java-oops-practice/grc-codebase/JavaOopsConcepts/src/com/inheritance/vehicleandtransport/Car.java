package com.inheritance.vehicleandtransport;

public class Car extends Vehicle {

	String colour;
	int seatCapacity;
	
	Car(int maxSpeed, String fuelType,String colour,int seatCapacity) {
		super(maxSpeed, fuelType);
		this.colour = colour;
		this.seatCapacity = seatCapacity;
		
	}
	public void displayInfo() {
		System.out.println();
		System.out.println("Car details : ");
		super.displayInfo();
		System.out.println("Colour : "+colour);
        System.out.println("Seat Capacity : "+seatCapacity);
	}
}
