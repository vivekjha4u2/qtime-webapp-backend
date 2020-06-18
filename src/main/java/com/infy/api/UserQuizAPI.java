package com.infy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.infy.model.User;
import com.infy.service.UserService;
import com.infy.service.UserServiceImpl;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping(value="/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserQuizAPI {

	@Autowired
	private UserService userService;
	
	
	@Autowired
	private Environment environment;
	
	
	

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ResponseEntity<String> userRegister(@RequestBody User user) throws Exception {
		try {
			
			System.out.println("here");
		String userId=userService.registerUser(user);
		
		String s=environment.getProperty("API.REGISTRATION_SUCCESSFUL")+" : "+userId;
		ResponseEntity<String> response=new ResponseEntity<String>(s,HttpStatus.CREATED);
		return response;
	}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,	environment.getProperty(e.getMessage()), e);
	    }
		
		
	}
	
	
}
