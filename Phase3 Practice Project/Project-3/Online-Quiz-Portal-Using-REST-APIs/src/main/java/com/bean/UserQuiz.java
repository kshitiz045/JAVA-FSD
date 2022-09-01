package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userquiz")
public class UserQuiz {
	@Id
	private int userquizid;
	private String email;
	private int quizid;
	private int qid;
	private String useranswer;
	public int getUserquizid() {
		return userquizid;
	}
	public void setUserquizid(int userquizid) {
		this.userquizid = userquizid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQuizid() {
		return quizid;
	}
	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getUseranswer() {
		return useranswer;
	}
	public void setUseranswer(String useranswer) {
		this.useranswer = useranswer;
	}
	@Override
	public String toString() {
		return "UserQuiz [userquizid=" + userquizid + ", email=" + email + ", quizid=" + quizid + ", qid=" + qid
				+ ", useranswer=" + useranswer + "]";
	}

	
}
