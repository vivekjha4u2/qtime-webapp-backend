package com.infy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.infy.entity.QuestionEntity;
import com.infy.model.Question;



@Repository("QuestionDao")
public class QuestionDAOImpl implements QuestionDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public int addQuestion(Question question)
	{
		QuestionEntity qe=new QuestionEntity();
		
		qe.setQuestion(question.getQuestion());
		qe.setCategory(question.getCategory());
		
	    entityManager.persist(qe);
	 
	    System.out.println("inserted");
	    
	    return (qe.getQuesId());
	}

	@Override
	public List<Question> getQuestionByCategory(char category) throws Exception {
		// TODO Auto-generated method stub
		List<Integer> qids=getIdsByCategory(category);
		Random r = new Random();
		
		List<QuestionEntity> qe=new ArrayList<QuestionEntity>();
		while(true)
		{
			int random=r.nextInt((37 - 1) + 1);
			if(qids.contains(random))
			{
				String queryString="select q from QuestionEntity q where q.quesId="+random;
				System.out.println(queryString);
				Query query=entityManager.createQuery(queryString);
				QuestionEntity ques=null;
				ques=(QuestionEntity)query.getSingleResult();
				qe.add(ques);
				System.out.println(ques.getQuestion());
			}
			
			
			
			
			if(qe.size()==15)
			{
				break;
			}
			
		}
		
		
		//String queryString ="select q from QuestionEntity q where q.quesId=5 and q.quesId in "+qids;
		//Query query=entityManager.createQuery(queryString);
		//query.setParameter(1, qids);
		//List<QuestionEntity> qe=query.getResultList();
		List<Question> quesList=new ArrayList<Question>();
		
		for(QuestionEntity item:qe)
		{
			Question question=new Question();
			question.setQuesId(item.getQuesId());
			question.setQuestion(item.getQuestion());
			question.setCategory(item.getCategory());
			quesList.add(question);
		}
	
		System.out.println(quesList.size());
		
		System.out.println(qe.size());
		
		return quesList;
	}
	
	
	public List<Integer> getIdsByCategory(char category) {
		String queryString="select q from QuestionEntity q where q.category=?1";
		
		Query query=entityManager.createQuery(queryString);
		query.setParameter(1, category);
		List<Integer> qids=new ArrayList<Integer>();
		List<QuestionEntity> qe=query.getResultList();
		
		for(QuestionEntity item:qe)
		{
			qids.add(item.getQuesId());
			
		}
		
		
		return qids;
		
		
		
		
		
		
	}
	
}
