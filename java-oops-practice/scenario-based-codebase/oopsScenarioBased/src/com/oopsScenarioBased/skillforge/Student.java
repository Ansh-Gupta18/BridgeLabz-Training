package com.oopsScenarioBased.skillforge;

public class Student extends User {

    int progress;   // percentage

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; // operator usage
    }
}
