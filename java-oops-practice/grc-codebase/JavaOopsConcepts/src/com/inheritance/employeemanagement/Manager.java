package com.inheritance.employeemanagement;

public class Manager extends Employee {

	int teamSize;
	String deparmentName;
	
	Manager(String name, int id, double salary,int teamSize,
	String deparmentName){
		super(name,id,salary);
		this.deparmentName = deparmentName;
		this.teamSize = teamSize;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Deparment Name :" +deparmentName);
		System.out.println("Team Size : "+teamSize);
	}
}
