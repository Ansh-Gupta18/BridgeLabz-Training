package com.generics.multileveluniversity;

import java.util.List;

class CourseUtil {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(
                "Course: " + c.getCourseName() +
                " | Evaluation: " + c.getEvaluationType()
            );
        }
    }
}
