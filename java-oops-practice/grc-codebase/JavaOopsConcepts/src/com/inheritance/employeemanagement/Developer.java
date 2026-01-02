package com.inheritance.employeemanagement;

public class Developer extends Employee {

	
	String programmingLanguage;
	String typeOfDevloper;
	int workingYear;
	
	Developer(String name, int id, double salary,String programmingLanguage,
	String typeOfDevloper,int workingYear){
		super(name, id, salary);
		this.programmingLanguage =programmingLanguage;
		this.typeOfDevloper = typeOfDevloper;
		this.workingYear = workingYear;
	}
	
	public void  displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language : "+programmingLanguage);
		System.out.println("Type Of Developer : "+typeOfDevloper);
		System.out.println("Working Year : "+workingYear);
		
	}
}
