package com.infy.entity;

import javax.persistence.*;

@Entity
@Table(name="quiz_reply")
public class QuizReplyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="rid")
	private long rId;

	private String quizId;
	
	@Column
	private String question;
	
	@Column
	private String answer;

	@Column
	private String p_name;

	public long getrId() {
		return rId;
	}

	public void setrId(long rId) {
		this.rId = rId;
	}

	public String getQuizId() {
		return quizId;
	}

	public void setQuizId(String quizId) {
		this.quizId = quizId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

}
