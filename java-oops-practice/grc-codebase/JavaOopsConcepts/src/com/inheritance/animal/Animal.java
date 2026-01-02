package com.inheritance.animal;

public class Animal {

	String name;
	int age;
	
	void speak() {
        System.out.println("Animal is speaking");
    }

	Animal(String name,int age){
		this.age = age;
		this.name = name;
	}
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
