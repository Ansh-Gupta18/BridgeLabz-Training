package com.inheritance.librarymanagement;

public class Book {

	String title;
	int publicationYear;
	
	Book(String title,int publicationYear){
		this.publicationYear = publicationYear;
		this.title = title;
	}
	public void displayInfo() {
		System.out.println("Publication Year: "+publicationYear);
		System.out.println("Title :"+title);
	}
}
