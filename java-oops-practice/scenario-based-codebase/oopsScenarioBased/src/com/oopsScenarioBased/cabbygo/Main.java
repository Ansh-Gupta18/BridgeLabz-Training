package com.oopsScenarioBased.cabbygo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object of vehicle class
		Vehicle vehicle1 = new Sedan("Mp 04 7894");
		
		//Creating object of Driver class
		Driver driver1 = new Driver("Rohan",23478,3.5,"Prabhat",10,vehicle1);
		
		//Creating object of Customer class
		Customer customer1 = new Customer("Rahul",200,driver1);
		
		//Displaying driver previous rating
		System.out.println("----------------------------");
		driver1.displayDriverInfo();
		System.out.println("----------------------------");
		
		//Booking ride
		customer1.bookRide();
		
		//Ending ride and rating driver
		System.out.println("----------------------------");
		customer1.endRide(4.5);
		
		//Checked driver current rating
		System.out.println("----------------------------");
		driver1.displayDriverInfo();
		System.out.println("----------------------------");
	}

}
