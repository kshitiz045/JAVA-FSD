package com.service;

import java.util.List;

import com.bean.Teacher;
import com.dao.TeacherDao;

public class TeacherService {

	TeacherDao tu = new TeacherDao();
	
	public String storeTeacherDetails(Teacher teacher) {
		if(tu.storeTeacher(teacher)>0) {
			return "Teacher details stored successfully";
		}else {
			return "Teacher details didn't store";
		}
	}
	
	public List<Teacher> findAllTeacher() {
		return tu.findAllTeacher();
	}
}