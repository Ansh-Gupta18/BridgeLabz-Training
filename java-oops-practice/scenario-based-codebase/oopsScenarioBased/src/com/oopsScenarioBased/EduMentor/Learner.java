package com.oopsScenarioBased.EduMentor;

class Learner extends User implements ICertifiable {

    private String courseType; // short or full-time

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    // Polymorphism
    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Short Course Certificate generated for " + name);
        } else {
            System.out.println("Full-Time Course Certificate generated for " + name);
        }
    }
}

class Instructor extends User {

    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    public void createCourse() {
        System.out.println("Instructor " + name + " created a new course.");
    }
}

