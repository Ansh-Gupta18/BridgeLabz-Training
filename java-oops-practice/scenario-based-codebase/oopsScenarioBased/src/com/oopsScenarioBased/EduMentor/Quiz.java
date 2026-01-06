package com.oopsScenarioBased.EduMentor;

class Quiz {

    // Private question bank (access modifier)
    private String[] questions;
    private final String[] answers; // cannot be modified
    private int score;
    private String difficulty;

    // Constructor with difficulty
    public Quiz(String difficulty, String[] questions, String[] answers) {
        this.difficulty = difficulty;
        this.questions = questions;
        this.answers = answers;
    }

    // Method to attempt quiz
    public void attemptQuiz(String[] userAnswers) {
        score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
    }

    // Operator usage to calculate percentage
    public double getPercentage() {
        return (score * 100.0) / answers.length;
    }

    public void showResult() {
        System.out.println("Score: " + score);
        System.out.println("Percentage: " + getPercentage() + "%");
    }
}

