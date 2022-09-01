package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quizresult")
public class QuizResult {
	@Id 
	private int userquizid;
	private String selectedans;
	private String correctans;
	private String score;
	public int getUserquizid() {
		return userquizid;
	}
	public void setUserquizid(int userquizid) {
		this.userquizid = userquizid;
	}
	public String getSelectedans() {
		return selectedans;
	}
	public void setSelectedans(String selectedans) {
		this.selectedans = selectedans;
	}
	public String getCorrectans() {
		return correctans;
	}
	public void setCorrectans(String correctans) {
		this.correctans = correctans;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "QuizResult [userquizid=" + userquizid + ", selectedans=" + selectedans + ", correctans=" + correctans
				+ ", score=" + score + "]";
	}
	
	

}
