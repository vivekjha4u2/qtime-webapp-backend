package com.infy.service;

import com.infy.dao.QuizReplyDAO;
import com.infy.model.QuizReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


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

    @Override
    public List<QuizReply> getQuizReplyById(String quizId) throws Exception {
        List<QuizReply> qr=quizReplyDao.getQuizReplyById(quizId);
        if(qr.size()==0 && qr.isEmpty())
        {
            throw new Exception("QuizReplyService.REPLY_NOT_FOUND");
        }
        return qr;
    }
}
