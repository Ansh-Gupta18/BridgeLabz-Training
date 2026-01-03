package com.oopsScenarioBased.cabbygo;

//Inheriting properties of Vehicle class
public class Mini extends Vehicle  {

	//Parameterized constructor
	public Mini(String vehicleNumber) {
		super(vehicleNumber);
		setCapacity(3);
		setType("Mini");
		setBaseRate(100);
		
	}

}
