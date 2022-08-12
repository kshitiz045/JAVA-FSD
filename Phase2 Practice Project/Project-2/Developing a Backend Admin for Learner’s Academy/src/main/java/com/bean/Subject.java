package com.bean;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	private int subjectId;
	private String subjectName;
	private String subjectCode;
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectCode=" + subjectCode
				+ "]";
	}
	
	

}
