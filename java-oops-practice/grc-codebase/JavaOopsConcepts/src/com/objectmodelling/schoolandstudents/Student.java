package com.objectmodelling.schoolandstudents;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Student {
	//private instance of Company class
    private String name;
    private List<Course> courses = new ArrayList<>();
    
    //Parameterized constructor
    public Student(String name) {
        this.name = name;
    }
    
    //Public method to add enrollment 
    public void enrollCourse(Course course) {
        courses.add(course);
    }
    
    //Public method to display result
    public void viewCourses() {
        System.out.println(name + " enrolled courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
