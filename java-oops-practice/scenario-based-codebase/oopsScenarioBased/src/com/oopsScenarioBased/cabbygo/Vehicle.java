package com.oopsScenarioBased.cabbygo;

//Super Class
public class Vehicle {
	
	//Private instance  of class
	private int baseRate;
	
	//Protected instance of class
	protected String vehicleNumber;
	protected int capacity;
	protected String type;
	
	//Parameterized Constructor
	public Vehicle(String vehicleNumber) {
		
		this.vehicleNumber = vehicleNumber;
		
	}
	
	//Method to set Vehicle number
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	//Method to set capacity
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	//Method to set type
	public void setType(String type) {
		this.type = type;
	}

	//Method to get base rate
	public int getBaseRate() {
		return this.baseRate;
	}

	//Method to set base rate
	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}
	
	
	
	
}
