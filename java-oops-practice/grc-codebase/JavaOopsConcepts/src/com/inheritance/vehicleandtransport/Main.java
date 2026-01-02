package com.inheritance.vehicleandtransport;

public class Main {

	public static void main(String args[]) {
		Vehicle v = new Vehicle(120,"petrol");
		v.displayInfo();
		Motorcycle m = new Motorcycle(110,"petrol","Hero");
		m.displayInfo();
		Truck t = new Truck(80,"Diesel",8);
		t.displayInfo();
		Car c = new Car(230,"gas + petrol","red",7);
		c.displayInfo();
		
	}
}
