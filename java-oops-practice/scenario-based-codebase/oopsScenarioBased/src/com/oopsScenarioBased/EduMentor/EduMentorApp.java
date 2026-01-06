package com.oopsScenarioBased.EduMentor;

public class EduMentorApp {

    public static void main(String[] args) {

        Learner learner = new Learner("Ansh", "ansh@gmail.com", 101, "full-time");

        String[] questions = {
                "Java is platform independent?",
                "JVM is part of JDK?"
        };

        String[] answers = {"yes", "yes"};

        Quiz quiz = new Quiz("Medium", questions, answers);

        String[] userAnswers = {"yes", "yes"};
        quiz.attemptQuiz(userAnswers);
        quiz.showResult();

        learner.generateCertificate();
    }
}

