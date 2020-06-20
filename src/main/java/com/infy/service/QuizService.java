package com.infy.service;

import java.util.List;

import com.infy.model.Quiz;

public interface QuizService {
	public String createQuiz(Quiz quiz) throws Exception;
	
	public List<Quiz> getQuestionByQuizId(String quizId) throws Exception;
}
