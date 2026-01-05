package com.oopsScenarioBased.campusconnection;

public abstract class Person {
	protected String name;
	protected String email;
	protected int id;
	
	public Person(String name, String email, int id) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	abstract void printDetails();

}