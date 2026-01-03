package com.oopsScenarioBased.cabbygo;

//Inheriting properties of Vehicle class
public class Sedan extends Vehicle {

	//Parameterized constructor
	public Sedan(String vehicleNumber) {
		super(vehicleNumber);
		setCapacity(4);
		setType("Sedan");
		setBaseRate(300);
		
	}

}
