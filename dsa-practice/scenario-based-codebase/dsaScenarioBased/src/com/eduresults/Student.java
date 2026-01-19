package com.oopsScenarioBased.eduresults;

class Student {

    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return rollNo + " - " + name + " : " + marks;
    }
}
