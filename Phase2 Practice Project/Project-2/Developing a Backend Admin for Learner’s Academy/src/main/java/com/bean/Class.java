package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Class {
	@Id
	private int classId;
	private String section;
	private String teacher;
	private String subject;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Class [classId=" + classId + ", section=" + section + ", teacher=" + teacher + ", subject=" + subject
				+ "]";
	}
	
	

}
