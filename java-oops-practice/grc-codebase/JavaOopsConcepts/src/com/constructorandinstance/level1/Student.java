package com.constructorandinstance.level1;

public class Student {

	public int rollNumber;
	protected String name;
	private double CGPA;
	
	
	public void setCGPA(double c) {
		CGPA = c;
	}
	public double getCGPA() {
		return CGPA;
	}
	
	class PostgraduateStudent extends Student{
		public void display() {
			System.out.println("Name : "+name);
			System.out.println("Roll number : "+rollNumber);
			System.out.println("CGPA : "+getCGPA());
		}
	}


	public static void main(String agrs[]) {
	Student sc = new Student();
	Student.PostgraduateStudent p = sc.new PostgraduateStudent();
	p.rollNumber = 101;
	p.name = "bob";
	p.setCGPA(8.5);

	p.display();

	}
	}
