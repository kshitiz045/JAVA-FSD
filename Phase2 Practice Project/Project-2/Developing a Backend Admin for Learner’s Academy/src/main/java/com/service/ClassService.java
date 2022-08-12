package com.service;

import java.util.List;

import com.bean.Class;
import com.dao.ClassDao;

public class ClassService {

	ClassDao sd = new ClassDao();
	
	public String storeClassDetails(Class classes) {
		if(sd.storeClass(classes)>0) {
			return "Class details stored successfully";
		}else {
			return "Class details didn't store";
		}
	}
	
	public List<Class> findAllClass() {
		return sd.findAllClass();
	}
}