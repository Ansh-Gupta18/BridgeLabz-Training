package com.oopsScenarioBased.skillforge;

public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor inst = new Instructor("Dr. Sharma", "sharma@skillforge.com");
        Student stu = new Student("Ansh", "ansh@gmail.com");

        String[] modules = {"Java Basics", "OOP", "Spring"};
        Course course = new AdvancedCourse("Java Development", inst, modules);

        stu.updateProgress(3, modules.length);
        System.out.println("Student Progress: " + stu.progress + "%");

        course.generateCertificate();
    }
}
