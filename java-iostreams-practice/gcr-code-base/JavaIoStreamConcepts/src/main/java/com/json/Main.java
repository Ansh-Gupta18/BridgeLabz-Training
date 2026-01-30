package com.json;

import com.fasterxml.jackson.databind.ObjectMapper;

//Car class
 class Car {
	private String brand;
	private String model;
	private int year;

	// parameterized constructor
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// getters and setters
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
}

public class Main {
	public static void main(String[] args) throws Exception {

		Car car = new Car("Toyota", "Corolla", 2022); // create object

		ObjectMapper mapper = new ObjectMapper(); // Jackson mapper

		String json = mapper.writeValueAsString(car); // Java → JSON

		System.out.println(json); // output
	}
}
