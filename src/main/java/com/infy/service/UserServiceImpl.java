package com.infy.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.dao.UserDAO;
import com.infy.model.User;



@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;
	
	@Override
	public String registerUser(User user) throws Exception
	{
		try {
		String userid=userDao.registerUser(user);
		return userid;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	

}
