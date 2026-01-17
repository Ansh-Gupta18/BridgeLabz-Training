package com.examproctor;

public class Main {
    public static void main(String[] args) {

        Exam exam = new Exam();

        // Add questions
        exam.addQuestion(1, "A");
        exam.addQuestion(2, "B");
        exam.addQuestion(3, "C");

        // Navigation
        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.goBack();

        // Evaluate
        int score = exam.evaluateScore();
        System.out.println("Final Score: " + score);
    }
}

