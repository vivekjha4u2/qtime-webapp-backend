package com.infy.dao;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infy.entity.UserEntity;

import com.infy.model.User;


@Repository("userDao")

public class UserDAOImpl implements UserDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public String registerUser(User user)
	{
		UserEntity ue=new UserEntity();
		ue.setUserName(user.getUserName());
		ue.setGender(user.getGender());
		Random r = new Random( System.currentTimeMillis() );
	    int qid=(1 + r.nextInt(2)) * 10000 + r.nextInt(10000); 
	    ue.setQuizId("Q-"+qid);
	    System.out.println(ue.getUserName()+" "+ue.getGender()+" "+ue.getQuizId());
	   
	    //ue.setUserId(3);
	    entityManager.persist(ue);
	    System.out.println("inserted");
	    return (ue.getQuizId());
	}
		
		
	
}
