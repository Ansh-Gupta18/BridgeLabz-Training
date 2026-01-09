package com.oopsScenarioBased.skillforge;

public class Course implements ICertifiable {

    String title;
    Instructor instructor;
    String[] modules;
    protected double rating;      // encapsulated logic
    private String[] reviews;     // read-only internally

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Advanced"};
        this.rating = 4.0;
        this.reviews = new String[]{"Good", "Very Helpful"};
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 4.5;
        this.reviews = new String[]{"Excellent"};
    }

    // Read-only reviews
    public String[] getReviews() {
        return reviews;
    }

    // Polymorphism
    public void generateCertificate() {
        System.out.println("Certificate: Completion of " + title);
    }
}

