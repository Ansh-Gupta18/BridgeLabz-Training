package com.inheritance.librarymanagement;

public class Author extends Book{

	String name;
	int age;
	
	
	Author(String title, int publicationYear,String name,int age) {
		super(title, publicationYear);
		this.age = age;
		this.name = name;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Name : "+name);
		System.out.println("Age :"+age);
	}
}
