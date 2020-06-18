package com.infy.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.infy.entity.QuizEntity;
import com.infy.model.Quiz;

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
}
