package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Login;
import com.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	

	//http://localhost:8383/participants/signup
	@RequestMapping(value = "/participants/signup",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String storeParticipants(@RequestBody Login log) {		// scan the value from reqeust body in the form json 
		return loginservice.storeParticipants(log);
	}
	
	//http://localhost:8383/participants/login
	@RequestMapping(value = "/participants/login",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String loginParticipants(@RequestBody Login log) {		// scan the value from reqeust body in the form json 
		return loginservice.loginParticipants(log);
	}
	
	//http://localhost:8383/admin/login
	@RequestMapping(value = "/admin/login",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String adminlogin(@RequestBody Login log) {		// scan the value from reqeust body in the form json 
		return loginservice.adminlogin(log);
	}
	
	//http://localhost:8383/admin/changePassword
	@RequestMapping(value="/admin/changePassword", consumes=MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.PUT)
	public String changeAdminPassword(@RequestBody Login log) {
		return loginservice.changeAdminPassword(log);
	}
	
	//http://localhost:8383/participants/changePassword
	@RequestMapping(value="/participants/changePassword", consumes=MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.PUT)
	public String changeParticipantsPassword(@RequestBody Login log) {
		return loginservice.changeParticipantsPassword(log);
	}


}
