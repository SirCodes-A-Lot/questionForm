package com.quiz.repository;

import org.springframework.data.repository.CrudRepository;

import com.quiz.quizObjects.QuizQuestion;

public interface QuestionRepository extends CrudRepository<QuizQuestion, String> {

}
