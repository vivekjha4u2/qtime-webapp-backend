package com.infy.service;

import java.util.List;

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


	@Override
	public List<Quiz> getQuestionByQuizId(String quizId) throws Exception {
		List<Quiz> ql=quizDao.getQuestionByQuizId(quizId);
		if(ql.size()==0 && ql.isEmpty())
		{
			throw new Exception("QuestionService.QUESTIONS_NOT_FOUND");
		}
		return ql;
	}

	//for getting ques & replies from quizId


	
		
}
