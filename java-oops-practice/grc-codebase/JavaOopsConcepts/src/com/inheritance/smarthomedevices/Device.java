package com.inheritance.smarthomedevices;

public class Device {

	int deviceId; 
	String status;
	
	Device(int deviceId	, String status){
		this.deviceId = deviceId;
		this.status = status;
	}
	public void displayStatus() {
		System.out.println("deviceId : "+deviceId);
		System.out.println("Status : "+status);
	}
}
