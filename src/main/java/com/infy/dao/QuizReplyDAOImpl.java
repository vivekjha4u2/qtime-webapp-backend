package com.infy.dao;

import com.infy.entity.QuizReplyEntity;
import com.infy.model.QuizReply;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("quizReplyDao")
public class QuizReplyDAOImpl implements QuizReplyDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public String addAnswer(QuizReply quizReply) throws Exception {
        QuizReplyEntity qr=new QuizReplyEntity();
        qr.setQuizId(quizReply.getQuizId());
        qr.setQuestion(quizReply.getQuestion());
        qr.setAnswer(quizReply.getAnswer());
        qr.setP_name(quizReply.getP_name());
        entityManager.persist(qr);
        return qr.getP_name();
    }
}
