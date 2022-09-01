package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginrepo;

		
	public String storeParticipants(Login log) {
		
		Optional<Login> op = loginrepo.findById(log.getId());
		if(op.isPresent()) {
			return "User id must be unique , pls try again";
		}else {
				loginrepo.save(log);				// insert new records
				return "User registered successfully";
		}
	}

public String loginParticipants(Login log) {
	
	Optional<Login> op = loginrepo.findById(log.getId());
	if(op.isPresent()) {
		return "Login Successfully";
	}else {
							// insert new records
			return "wrong credentials , try agin!!!";
	}
}

public String adminlogin(Login log) {
	
	Optional<Login> op = loginrepo.findById(log.getId());
	if(op.isPresent()) {
		return "Login Successfully";
	}else {
						
			return "wrong credentials , try agin!!!";
	}
}

public String changeAdminPassword(Login log) {
Optional<Login> op = loginrepo.findById(log.getId());
if(op.isPresent()) {
		 	Login e	= op.get();
		 	e.setPassword(log.getPassword());
		 	loginrepo.saveAndFlush(e);			// update 	existing record update property 
		 	return "Password changed successfully";
}else {
		
		return "Password not changed , try again !!!";
}
}

public String changeParticipantsPassword(Login log) {
Optional<Login> op = loginrepo.findById(log.getId());
if(op.isPresent()) {
		 	Login e	= op.get();
		 	e.setPassword(log.getPassword());
		 	loginrepo.saveAndFlush(e);			// update 	existing record update property 
		 	return "Password changed successfully";
}else {
		
		return "Password not changed";
}
}


}
