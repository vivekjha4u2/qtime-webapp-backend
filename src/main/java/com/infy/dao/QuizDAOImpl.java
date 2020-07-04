package com.infy.dao;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

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
		System.out.println(quiz.getUrl());
		q.setUrl(quiz.getUrl());
		
	    entityManager.persist(q);
		
		return q.getQuizId();
	}


	@Override
	public List<Quiz> getQuestionByQuizId(String quizId) throws Exception {
		List<QuizEntity> qe=new ArrayList<QuizEntity>();
		String querystr="select q from QuizEntity q where q.quizId='"+quizId+"'";
		Query query=entityManager.createQuery(querystr);
		//query.setParameter("id",quizId);


		 qe=query.getResultList();
		 List<Quiz> ql=new ArrayList<Quiz>();
		for(QuizEntity item:qe)
		{
			Quiz q=new Quiz();
			q.setQid(item.getqId());
			q.setQuizId(item.getQuizId());
			q.setQuestion(item.getQuestion());
			q.setUrl(item.getUrl());
			ql.add(q);


		}

		 
		return ql;
	}

}
