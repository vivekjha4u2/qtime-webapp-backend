package com.infy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.infy.model.Question;
import com.infy.model.Quiz;
import com.infy.model.QuizReply;
import com.infy.service.QuizService;

@RestController
@RequestMapping(value="/quiz")
@CrossOrigin(origins = "http://localhost:3000")
public class QuizAPI {
	@Autowired
	private QuizService quizService;
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<String> createQuiz(@RequestBody Quiz quiz) throws Exception{
		try {			
			System.out.println("here");
			String exampleId=quizService.createQuiz(quiz);			
			String s=environment.getProperty("API.REGISTRATION_SUCCESSFUL")+" : "+exampleId;
			ResponseEntity<String> response=new ResponseEntity<String>(s,HttpStatus.CREATED);
			return response;
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,	environment.getProperty(e.getMessage()), e);
	    }
		
	}


	@RequestMapping(value = "{quizId}",method = RequestMethod.GET)

	public ResponseEntity<List<Quiz>> getquestionByQuizId(@PathVariable String quizId) throws Exception{
		try{
			//System.out.println("here");
			List<Quiz> ql=quizService.getQuestionByQuizId(quizId);
			ResponseEntity<List<Quiz>> response=new ResponseEntity<List<Quiz>>(ql,HttpStatus.OK);
			return response;

		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,	environment.getProperty(e.getMessage()), e);
		}

	}
	
	
	
	
	
}
