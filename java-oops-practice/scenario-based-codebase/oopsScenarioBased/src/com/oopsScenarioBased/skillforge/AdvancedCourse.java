package com.oopsScenarioBased.skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    // Polymorphism
    public void generateCertificate() {
        System.out.println("Advanced Certificate: Mastery in " + title);
    }
}

