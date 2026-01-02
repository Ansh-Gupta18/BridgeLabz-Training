package com.inheritance.animal;

public class Bird extends Animal {

	String flyType;

	
	
	Bird(String name, int age,String flyType) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.flyType = flyType;
	}

	void speak() {
		super.speak();
        System.out.println("Bird is caw");
    }
	public void display() {
		super.display();
		System.out.println("Flytype :"+flyType);
	}
	
	
}
