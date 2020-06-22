package com.infy.dao;

import com.infy.entity.QuizReplyEntity;
import com.infy.model.QuizReply;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<QuizReply> getQuizReplyById(String quizId) throws Exception {
        List<QuizReplyEntity> qre=new ArrayList<QuizReplyEntity>();
        String querystr="select q from QuizReplyEntity q where q.quizId='"+quizId+"'";
        Query query=entityManager.createQuery(querystr);
        qre=query.getResultList();
        List<QuizReply> qr=new ArrayList<QuizReply>();
        for(QuizReplyEntity item:qre)
        {
            QuizReply q=new QuizReply();
            q.setQuizId(item.getQuizId());
            q.setQuestion(item.getQuestion());
            q.setAnswer(item.getAnswer());
            q.setP_name(item.getP_name());
            qr.add(q);
        }
        return qr;


    }
}
