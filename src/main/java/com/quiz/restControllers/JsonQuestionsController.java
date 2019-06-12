package com.quiz.restControllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizObjects.QuizQuestion;
import com.quiz.quizObjects.Response;
import com.quiz.services.QuestionRepositoryService;
import com.quiz.services.QuizSubmissionService;

@RestController
public class JsonQuestionsController {
	
	private QuestionRepositoryService questionRepositoryService;
	
	@Autowired
	public JsonQuestionsController(
			QuestionRepositoryService questionRepositoryService,
			QuizSubmissionService quizSubmissionService) {
		this.questionRepositoryService = questionRepositoryService;
	}

	@GetMapping("/getQuestions")
	public Response getQuestions() {
		HashMap<String,Object> data = new HashMap<>();
		ArrayList <QuizQuestion> questions = questionRepositoryService.getAllQuestions();
		for (int i=0; i< questions.size(); i++) {
			data.put(String.valueOf(i + 1), questions.get(i));
		}
		return new Response("200", data);
	}
	
	@PostMapping("/submitQuestions")
	public Response submitQuestions(@RequestBody String requestBody) {
		System.out.println(requestBody);
		HashMap<String,Object> data = new HashMap<>();
		return new Response("200", data);
	}
}