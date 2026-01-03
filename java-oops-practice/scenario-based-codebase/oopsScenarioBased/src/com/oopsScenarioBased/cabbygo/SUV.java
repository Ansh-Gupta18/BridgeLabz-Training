package com.oopsScenarioBased.cabbygo;

//Inheriting properties of Vehicle class
public class SUV extends Vehicle  {

	//Parameterized constructor
	public SUV(String vehicleNumber) {
		super(vehicleNumber);
		setCapacity(6);
		setType("SUV");
		setBaseRate(400);
		
	}

}