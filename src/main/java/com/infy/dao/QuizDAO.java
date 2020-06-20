package com.infy.dao;

import java.util.List;

import com.infy.model.Quiz;
import com.infy.model.QuizReply;

public interface QuizDAO {

	public String createQuiz(Quiz quiz);

	public List<Quiz> getQuestionByQuizId(String quizId) throws Exception;
}
