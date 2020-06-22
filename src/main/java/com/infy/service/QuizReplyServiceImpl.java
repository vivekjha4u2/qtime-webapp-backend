package com.infy.service;

import com.infy.dao.QuizReplyDAO;
import com.infy.model.QuizReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service("quizReplyService")
@Transactional
public class QuizReplyServiceImpl implements QuizReplyService {

    @Autowired
    private QuizReplyDAO quizReplyDao;

    @Override
    public String addAnswer(QuizReply quizReply) throws Exception {
        String name=quizReplyDao.addAnswer(quizReply);
        return name;

    }
}
