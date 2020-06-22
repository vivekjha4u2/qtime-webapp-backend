package com.infy.service;

import com.infy.model.Question;
import com.infy.model.QuizReply;

import java.util.List;

public interface QuizReplyService {
    public String addAnswer(QuizReply quizReply  ) throws Exception;
    public List<QuizReply> getQuizReplyById(String quizId) throws Exception;
}
