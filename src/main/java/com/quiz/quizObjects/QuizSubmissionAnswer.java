package com.quiz.quizObjects;

public class QuizSubmissionAnswer {
	
	private String questionId;
	
	private boolean isCorrect;
	
	private String correctAnswer;
	
	public QuizSubmissionAnswer (String id, boolean isCorrect, String correctAnswer) {
		this.questionId = id;
		this.isCorrect = isCorrect;
		this.correctAnswer = correctAnswer;
	}

	public String getQuestionId() {
		return questionId;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}
}
