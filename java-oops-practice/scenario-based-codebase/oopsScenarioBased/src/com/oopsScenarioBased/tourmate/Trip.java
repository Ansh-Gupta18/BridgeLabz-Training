package com.oopsScenarioBased.tourmate;

public class Trip implements IBookable{

	private String destination;
	protected int budget;
	protected String duration;
	
	public Trip(int budget, String duration) {
		super();
		this.budget = budget;
		this.duration = duration;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	 
	public  void book(int book) {
		 System.out.println("Booked a Domestic trip");
		 
	 }
	public void cancel(String cancel) {
		 System.out.println("You have cancelled the trip");
	 }
	 
	 public void book(String book) {
		 System.out.println("Booked a International Trip");
	 }
	 public void display() {
		 System.out.println("Destination :"+destination);
		 System.out.println("Budget :"+budget);
		 System.out.println("duration :"+duration);
	 }

	 @Override
	 public void cancel() {
		// TODO Auto-generated method stub
		
	 }



	
}
