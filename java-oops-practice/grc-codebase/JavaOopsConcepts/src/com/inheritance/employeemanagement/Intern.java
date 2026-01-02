package com.inheritance.employeemanagement;

public class Intern extends Employee {

	String field;
	
	Intern(String name, int id, double salary,String field){
		super(name,id,salary);
		this.field = field;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Field : "+field);
	}
}
