package com.infy.service;

import java.util.List;

import com.infy.model.Question;
import com.infy.model.User;

public interface QuestionService {
	public int addQuestion(Question question) throws Exception;
	public List<Question> getQuestionByCategory(char category) throws Exception;

}
