package com.inheritance.educationalcourse;

class Course {
    protected String courseName;
    protected int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course Name = " + courseName);
        System.out.println("Duration = " + duration + " hours");
    }
}
