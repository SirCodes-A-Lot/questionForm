package com.quiz.services;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizObjects.QuizSubmissionAnswer;
import com.quiz.repository.QuestionRepository;

@Service
public class QuizSubmissionService {
	
	private QuestionRepository questionRepository;
	
	@Autowired
	public QuizSubmissionService (QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public ArrayList <QuizSubmissionAnswer> assessSubmission (HashMap <String, Object> submittedQuiz) {
		ArrayList<QuizSubmissionAnswer> answers = new ArrayList<QuizSubmissionAnswer>();
		answers.add(assessAnswerForSubmission(new HashMap<>()));
		return answers;
	}
	
	private QuizSubmissionAnswer assessAnswerForSubmission(HashMap<String, Object> answer) {
		//TODO remove hard coded value
		questionRepository.findById("1");
		return new QuizSubmissionAnswer("1", false, "correct answer goes here");
	}
}
