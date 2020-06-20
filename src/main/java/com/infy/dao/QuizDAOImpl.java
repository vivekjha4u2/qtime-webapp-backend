package com.infy.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.infy.entity.QuizEntity;
import com.infy.entity.QuizReplyEntity;
import com.infy.model.Quiz;
import com.infy.model.QuizReply;

@Repository("QuizDao")
public class QuizDAOImpl implements QuizDAO{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public String createQuiz(Quiz quiz) {
		QuizEntity q = new QuizEntity();
		q.setQuestion(quiz.getQuestion());
		q.setQuizId(quiz.getQuizId());
		
	    entityManager.persist(q);
		
		return q.getQuizId();
	}
	
	//getting ques by quizId from quiz entity
	@Override
	public List<Quiz> getQuestionByQuizId(String quizId) throws Exception {
		/******using while*****/
		System.out.println("daoStart");
		List<QuizEntity> qe=new ArrayList<QuizEntity>();
		while(true)
		{
			System.out.println("daoWhile");
			String queryString="select q from QuizEntity q where q.quizId="+quizId;
			System.out.println(queryString);
			Query query=entityManager.createQuery(queryString);
			QuizEntity qure=null;
			qure=(QuizEntity)query.getSingleResult();
			qe.add(qure);
			System.out.println(qure.getQuestion());	
			
			//check the break condition
			if(qure == null)break;
		
		}
		/***********/
		
		/******without while*****/
		
//		System.out.println("daoStart");
//		List<QuizEntity> qe=null;	
//		System.out.println("daoWhile");
//		String queryString="select q from QuizEntity q where q.quizId="+quizId;
//		System.out.println(queryString);
//		Query query=entityManager.createQuery(queryString);
//		System.out.println("query.getResultList()->"+query.getResultList());
//		qe=(List<QuizEntity>)query.getResultList();
//		System.out.println("daomid");
		
		/***********/
		
		List<Quiz> quesList=new ArrayList<Quiz>();		
		for(QuizEntity item:qe)
		{
			Quiz quiz=new Quiz();
			quiz.setQuestion(item.getQuestion());
			quesList.add(quiz);
		}	
		System.out.println(quesList.size());		
		System.out.println(qe.size());		
		return quesList;
	}
}
