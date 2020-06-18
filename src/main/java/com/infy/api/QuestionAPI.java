package com.infy.api;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.infy.model.Question;
import com.infy.service.QuestionService;

@RestController
@RequestMapping(value="/question")
@CrossOrigin(origins = "http://localhost:3000")
public class QuestionAPI {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private Environment environment;
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseEntity<String> addQuestion(@RequestBody Question question) throws Exception{
		
		try {
			
			long quesid=questionService.addQuestion(question);
			String s=environment.getProperty("API.QUESTION_ADDED_SUCCESSFULLY")+" : "+quesid;
			ResponseEntity<String> response=new ResponseEntity<String>(s,HttpStatus.CREATED);
			return response;
			
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,	environment.getProperty(e.getMessage()), e);
	    }
		
		}
	
	@RequestMapping(value="/{category}",method=RequestMethod.GET)
	public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable char category) throws Exception
	{
		
		try {
			
			List<Question> questionList=questionService.getQuestionByCategory(category);
			for(Question item:questionList)
			{
				System.out.println(item.getQuesId()+" "+item.getQuestion()+" "+item.getCategory());
				
			}
			ResponseEntity<List<Question>> response=new ResponseEntity<List<Question>>(questionList,HttpStatus.OK);
			return response;
			
		}
		
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,	environment.getProperty(e.getMessage()), e);
	    }
		
	}
	
		
	
	
	
	

}
