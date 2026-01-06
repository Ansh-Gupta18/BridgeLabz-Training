package com.oopsScenarioBased.FitTrack;

public class UserProfile {

	private String name;
	private int age;
	private double weight;
	private String goal;
	
	UserProfile(String name,int age,double weight){
	this.name = name;
	this.age = age;
	this.weight = weight;
	this.goal = "Stay fit";

	}
	public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight > 0) {
			this.weight = weight;
		}
	}
	 public void showProfile() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Goal: " + goal);
	    }
}
