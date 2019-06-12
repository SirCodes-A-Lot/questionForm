package com.quiz.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.quiz.quizObjects.QuizQuestion;
import com.quiz.repository.QuestionRepository;

@Service
public class PopulateRepositoryOnStartup {
	
	private QuestionRepository questionRepository;
	
	private ArrayList<QuizQuestion> questions = new ArrayList<>(Arrays.asList(
			new QuizQuestion("1","What colour is a red fire truck?", "red", new String[] {
					"red", "green", "blue"}),
			new QuizQuestion("2","What colour is a green fire truck?", "green", new String[] {
					"yellow", "green"})
			));

	
	@Autowired
	public PopulateRepositoryOnStartup (QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void setProductsInDataBaseAfterStartup() {
		for (int i =0; i< questions.size(); i++){
			questionRepository.save(questions.get(i));
		}
	}
}
