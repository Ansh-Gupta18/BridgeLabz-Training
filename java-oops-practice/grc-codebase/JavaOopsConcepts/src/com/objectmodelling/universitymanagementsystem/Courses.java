package com.objectmodelling.universitymanagementsystem;

//Create a courses class
public class Courses {
	//private instance of class
	private String courseName;
	
	//Public method to set name
	public void setName(String courseName){
		this.courseName = courseName;
	}
	//public method to get name
	public String getName(){
		return courseName;
	}
	//Public method to assign professor
  public void assignProfessor(Professor professor) {
      System.out.println("Professor assigned.");
  }
}
