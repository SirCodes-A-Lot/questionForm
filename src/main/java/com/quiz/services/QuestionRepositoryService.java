package com.quiz.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizObjects.QuizQuestion;
import com.quiz.repository.QuestionRepository;

@Service
public class QuestionRepositoryService {
	
	private QuestionRepository questionRepository;
	
	@Autowired
	public QuestionRepositoryService (QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public ArrayList<QuizQuestion> getAllQuestions() {
		ArrayList <QuizQuestion> quizQuestions = new ArrayList<QuizQuestion>();
		for (QuizQuestion quizQuestion : questionRepository.findAll()) {
			quizQuestions.add(quizQuestion);
		}
		return quizQuestions;
	}	
}
