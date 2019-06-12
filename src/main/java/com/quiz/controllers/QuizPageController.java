package com.quiz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizPageController {
	
	@GetMapping("/questionpage")
	public String getQuizPage() {
		return "question-page";
	}

}
