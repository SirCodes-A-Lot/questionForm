package com.quiz.quizObjects;

import java.util.HashMap;

public class Response {
	
	private String status;
	private HashMap<String, Object> data;
	
	public Response (String status, HashMap <String, Object> data) {
		this.status = status;
		this.data = data;
	}

	public HashMap<String, Object> getData() {
		return data;
	}

	public String getStatus() {
		return status;
	}
}
