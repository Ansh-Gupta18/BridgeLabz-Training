package com.oopsScenarioBased.campusconnection;


public class Main {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma", "sharma@uni.edu", 101, "Computer Science");

        Course javaCourse = new Course("Java Programming", f1);
        Course pythonCourse = new Course("Python Programming", f1);


        Student s1 = new Student("Ansh", "Ansh@121.edu",101);
        Student s2 = new Student("Amit", "amit@uni.edu",102);

        s1.addGrade(89);
        s1.addGrade(90);
        s1.enrollCourse(javaCourse);
        s1.enrollCourse(pythonCourse);
        
       
        
       
        s2.addGrade(75);
        s2.addGrade(80);
        s2.enrollCourse(javaCourse);
        

        System.out.println("----------------Java Course Details----------------");
        javaCourse.showCourseDetails();
       
        
        System.out.println("---------------Python Course Details------------------");
        pythonCourse.showCourseDetails();


    }
}
