package com.inheritance.smarthomedevices;

public class Thermostat extends Device {

	String temperatureSetting;
	
	//Parameterized constructor
	public Thermostat(int deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	@Override
	public void displayStatus() {
		super.displayStatus();
		System.out.println("Temperature Setting : " + temperatureSetting);
		
	}
}
