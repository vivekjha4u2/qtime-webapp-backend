package com.infy.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dao.QuizDAO;
import com.infy.model.Quiz;

@Service("quizService")
@Transactional
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizDAO quizDao;
	
	@Override
	public String createQuiz(Quiz quiz) throws Exception{

		try {
			String exquizid=quizDao.createQuiz(quiz);
			return exquizid;
		}
		catch(Exception e){
			throw e;
		}
	}
}
