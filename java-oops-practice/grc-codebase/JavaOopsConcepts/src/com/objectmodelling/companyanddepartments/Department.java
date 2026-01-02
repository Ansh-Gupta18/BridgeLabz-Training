package com.objectmodelling.companyanddepartments;
import java.util.*;
public class Department {

	private String deparmentName;
	private List<Employee> employees = new ArrayList<>();
	
	public Department(String departmentName) {
		this.deparmentName = departmentName;
	}
	
	public void addEmployee(String employeeName) {
		employees.add(new Employee(employeeName));
	}
	
	public void showEmployees() {
		System.out.println("Employees in " +deparmentName+ ":");
		for(Employee emp : employees) {
			System.out.println("-" +emp.getEmployeeName());
		}
	}
}
