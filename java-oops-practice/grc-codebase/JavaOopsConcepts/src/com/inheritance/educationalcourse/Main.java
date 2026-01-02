package com.inheritance.educationalcourse;

public class Main {

	public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack Development",
                150,
                "Udemy",
                true,
                120000,
                10
            );

        System.out.println("------ Course Details ------");
        course.displayCourseInfo();
    }

}

