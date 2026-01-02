package com.objectmodelling.universitymanagementsystem;

//Created a Students class
public class Students {
	//public method to enroll student in courses
  public void enrollCourse(Courses course) {
      System.out.println("Student enrolled in " + course.getName());
  }
}