package com.bean;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private int age;

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + studentName + ", age=" + age + "]";
	}
	
	

}
