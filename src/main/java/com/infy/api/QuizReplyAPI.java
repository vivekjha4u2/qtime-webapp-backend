package com.infy.api;

import com.infy.model.QuizReply;
import com.infy.service.QuizReplyService;
import com.infy.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value="/quizreply")
public class QuizReplyAPI {
    @Autowired
    private QuizReplyService quizReplyService;

    @Autowired
    private Environment environment;

    @RequestMapping(value="/add", method= RequestMethod.POST)
    public ResponseEntity<String> addAnswer(@RequestBody QuizReply quizReply) throws Exception{
        try {
            System.out.println("here");
            String name=quizReplyService.addAnswer(quizReply);
            String s=environment.getProperty("API.QUESTION_SUCCESSFULLY_ADDED")+" : "+name;
            ResponseEntity<String> response=new ResponseEntity<String>(s, HttpStatus.CREATED);
            return response;
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,	environment.getProperty(e.getMessage()), e);
        }
    }



}
