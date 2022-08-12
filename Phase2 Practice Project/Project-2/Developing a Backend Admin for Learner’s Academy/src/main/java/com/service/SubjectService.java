package com.service;

import java.util.List;

import com.bean.Subject;
import com.dao.SubjectDao;

public class SubjectService {

	SubjectDao sdu = new SubjectDao();
	
	public String storeSubjectDetails(Subject subject) {
		if(sdu.storeSubject(subject)>0) {
			return "Subject details stored successfully";
		}else {
			return "Subject details didn't store";
		}
	}
	
	public List<Subject> findAllSubject() {
		return sdu.findAllSubject();
	}
}