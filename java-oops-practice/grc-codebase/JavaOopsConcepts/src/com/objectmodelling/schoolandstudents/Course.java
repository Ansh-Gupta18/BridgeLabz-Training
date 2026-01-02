package com.objectmodelling.schoolandstudents;

//Importing ArrayList form java.util package
import java.util.ArrayList;
import java.util.List;

public class Course {
	//private instance of Company class
  private String courseName;
  private List<Student> students = new ArrayList<>();
  
//Parameterized constructor
  public Course(String courseName) {
      this.courseName = courseName;
  }
  
  //Public method to get course name
  public String getCourseName() {
      return courseName;
  }
  
  //public method to add student
  public void addStudent(Student student) {
      students.add(student);
  }
  
  //public method to show student details
  public void showStudents() {
      System.out.println("Students in " + courseName + ":");
      for (Student s : students) {
          System.out.println("- " + s);
      }
  }
}
