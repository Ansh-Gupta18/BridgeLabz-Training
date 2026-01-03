package com.oopsScenarioBased.cabbygo;

public class Driver {
	//Private instance of class
	private String location;
	private int rate;
	
	//Protected instance of class
	protected String name;
	protected int licenseNumber;
	private double rating;	
	protected Vehicle vehicle;

	//Parameterized constructor
	public Driver(String name, int licenseNumber, double rating, String location, int rate, Vehicle vehicle) {
		
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
		this.location = location;
		this.rate = rate;
		this.vehicle = vehicle;
	}

	//Method to get rating
	public double getRating() {
		return rating;
	}
	
	//Method to set rating
	public void setRating(double rating) {
		this.rating = rating;
	}

	//Method to get driver location
	public String getLocation() {
		return location;
	}

	//Method to set driver location
	public void setLocation(String location) {
		this.location = location;
	}
	
	//Method to get rate
	public int getRate() {
		return rate;
	}

	//Method to set rate
	public void setRate(int rate) {
		this.rate = rate;
	}

	//Method to display driver info
	public void displayDriverInfo() {
		System.out.println("Rating of driver is " + rating);
	}
}
