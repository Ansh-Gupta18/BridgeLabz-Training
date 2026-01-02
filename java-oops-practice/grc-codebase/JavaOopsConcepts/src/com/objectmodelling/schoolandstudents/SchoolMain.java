package com.objectmodelling.schoolandstudents;

public class SchoolMain {
    public static void main(String[] args) {
    	
    	//Created object of student class
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        //Created object of Course class
        Course java = new Course("Java");
        Course python = new Course("Python");
        
        //Calling method to enroll courses
        s1.enrollCourse(java);
        s1.enrollCourse(python);
        s2.enrollCourse(java);
        
        //Calling method to display details
        s1.viewCourses();
        java.showStudents();
    }
}