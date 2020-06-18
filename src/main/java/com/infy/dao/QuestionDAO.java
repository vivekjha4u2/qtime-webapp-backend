package com.infy.dao;

import java.util.List;

import com.infy.model.Question;

public interface QuestionDAO {
	public int addQuestion(Question question) throws Exception;
	public List<Question> getQuestionByCategory(char category) throws Exception;
}
