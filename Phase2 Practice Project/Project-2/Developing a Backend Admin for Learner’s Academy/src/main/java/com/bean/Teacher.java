package com.bean;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int teacherId;
	private String teacherName;
	private int age;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", age=" + age + "]";
	}
	
	

}
