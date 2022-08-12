package com.service;

import com.bean.Login;

public class LoginService {

	public String checkLoginDetails(Login lg) {
		if(lg.getEmail().equals("admin@gmail.com") && lg.getPassword().equals("123")) {
			return "success";
		}else {
			return "falure";
		}
	}
}