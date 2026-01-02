package com.objectmodelling.universitymanagementsystem;

//Created a class that establish relationship between Student, professor and courses class
public class UniversityMain {
  public static void main(String[] args) {
  	
  	//Created object of students , professor and courses class
      Students students = new Students();
      Professor professor = new Professor("Dr. Mehta");
      Courses course = new Courses();
      
      //calling method to set course name
      course.setName("Java");
      
      //Calling method to enroll courses
      students.enrollCourse(course);
      
      //Calling method to assign professor to courses
      course.assignProfessor(professor);
  }
}
