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
	
	//for getting ques & replies from quizId
	@Override
	public List<Quiz> getQuestionByQuizId(String quizId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("servStart");
		List<Quiz> quesByQuizId=quizDao.getQuestionByQuizId(quizId);
		System.out.println("servEnd");
		if(quesByQuizId.isEmpty() && quesByQuizId.size()==0)
		{
			throw new Exception("QuestionByQuizService.QUESTIONS_NOT_FOUND");
		}
		
		return quesByQuizId;
	}
	
	
		
}
