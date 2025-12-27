package com.classandobject.level1;

public class EmployeeDetails {
	
	String name;
	int id;
	double salary;
	
	EmployeeDetails(String name,int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void displayEmployee() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Employee Salary: "+salary);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp = new EmployeeDetails("rohan",1,5000000);
		emp.displayEmployee();

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(2.5);
		circle.areaCircle();
		circle.circumferenceCircle();
		}

}
