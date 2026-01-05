package com.oopsScenarioBased.campusconnection;

public class Faculty extends Person {

    private String department;

    public Faculty(String name, String email, int id, String department) {
		super(name, email, id);
		this.department = department;
	}
	
    @Override
    void printDetails() {
        System.out.println("Faculty: " + name + ", Dept: " + department);
    }
}