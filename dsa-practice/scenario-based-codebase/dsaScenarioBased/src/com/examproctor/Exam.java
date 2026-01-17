package com.examproctor;

import java.util.*;
public class Exam {
	Stack<Integer> navigationStack = new Stack<>();
	
	HashMap<Integer, String> studentAnswers = new HashMap<>();
	HashMap<Integer, String> correctAnswers = new HashMap<>();

    void addQuestion(int id, String correctAnswer) {
        correctAnswers.put(id, correctAnswer);
    }

    void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

	 void submitAnswer(int questionId, String answer) {
	        studentAnswers.put(questionId, answer);
	        System.out.println("Answer saved for Question " + questionId);
	    }
	    void goBack() {
	        if (!navigationStack.isEmpty()) {
	            System.out.println("Going back from Question: " + navigationStack.pop());
	        } else {
	            System.out.println("No previous question!");
	        }
	    }

	    int evaluateScore() {
	        int score = 0;

	        for (int qid : correctAnswers.keySet()) {
	            if (correctAnswers.get(qid).equals(studentAnswers.get(qid))) {
	                score++;
	            }
	        }
	        return score;
	    }
	}


	