package com.oopsScenarioBased.tourmate;

public class Main {

	public static void main(String args[]) {
		Trip t = new Trip(50000,"1 month");
		t.setDestination("Manali");
		t.book(1);
		t.display();
		
		 Transport ts = new Transport(100000,"1 Week", 10000);
			Activity a = new Activity(10000,"3 week",2000);
			Hotel h = new Hotel(10000,"25 day",30000);
			 int totalBudget = ts.getTransportPrice() + a.getActivityPrice() + h.getHotelPrice();
			System.out.println("Total expense is : "+totalBudget);
		
		System.out.println();
		
		Trip t2 = new Trip(100000,"1 month");
	    t2.setDestination("London");
		t2.book(null);
		t2.display();
		
	 Transport ts1 = new Transport(100000,"1 Week", 30000);
	Activity ab = new Activity(10000,"3 week",25000);
	Hotel ha = new Hotel(10000,"30 day",45000);
	 int totalBudget1 = ts1.getTransportPrice() + ab.getActivityPrice() + ha.getHotelPrice();
	System.out.println("Total expense is : "+totalBudget1);
	}
}
