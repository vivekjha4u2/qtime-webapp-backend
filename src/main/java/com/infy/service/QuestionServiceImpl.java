package com.infy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dao.QuestionDAO;
import com.infy.model.Question;


@Service("questionService")
@Transactional
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionDAO questionDao;
	
	@Override
	public int addQuestion(Question question) throws Exception{
	{
		try {
			int qid=questionDao.addQuestion(question);
			return qid;
			}
			catch(Exception e)
			{
				throw e;
			}
	}

}

	@Override
	public List<Question> getQuestionByCategory(char category) throws Exception {
		// TODO Auto-generated method stub
		List<Question> quesByCategory=questionDao.getQuestionByCategory(category);
		if(quesByCategory.isEmpty() && quesByCategory.size()==0)
		{
			throw new Exception("QuestionService.QUESTIONS_NOT_FOUND");
		}
		
		return quesByCategory;
	}
}
