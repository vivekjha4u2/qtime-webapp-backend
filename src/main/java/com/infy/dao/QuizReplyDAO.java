package com.infy.dao;

import com.infy.model.Quiz;
import com.infy.model.QuizReply;

import java.util.List;

public interface QuizReplyDAO {
    public String addAnswer(QuizReply quizReply) throws Exception;
}
