package com.quiz.quizObjects;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuizQuestion {
	
	@Id
	private String id;
	private String question;
	private String correctAnswer;
	private String[] allAnswers;
	
	protected QuizQuestion() {
	}
	
	public QuizQuestion(String id, String question, String correctAnswer, String[] otherAnswers) {
		this.id = id;
		this.question = question;
		this.correctAnswer = correctAnswer;
		this.allAnswers = otherAnswers;
	}
	
	public String getId() {
		return id;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public String[] getAllAnswers() {
		return allAnswers;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public void setAllAnswers(String[] otherAnswers) {
		this.allAnswers = otherAnswers;
	}
	
	
}
