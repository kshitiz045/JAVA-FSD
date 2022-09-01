package com.controller;

import java.util.List;



import com.bean.Login;
import com.bean.Questions;
import com.bean.Quiz;

import com.bean.UserQuiz;
import com.repository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.service.OnlineService;

@RestController
public class MainController {
	
	@Autowired
	OnlineService service;
	
	@Autowired
	LoginRepository loginrepo;
	
	
	//http://localhost:8383/admin/addQuestions
	@RequestMapping(value = "/admin/addQuestions",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String addQuestions(@RequestBody Questions ques) {		// scan the value from reqeust body in the form json 
		return service.addQuestions(ques);
	}
	
	//http://localhost:8383/admin/updateQuestions
		@RequestMapping(value="/admin/updateQuestions", consumes=MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.PUT)
		public String updateQuestions(@RequestBody Questions ques) {
			return service.updateQuestions(ques);
		}
	
	//http://localhost:8383/admin/findQuestionsById
	@RequestMapping(value="admin/findQuestionsById/{qid}", method=RequestMethod.GET , consumes=MediaType.APPLICATION_JSON_VALUE)
	public String findQuestions(@PathVariable("qid") int qid) {
		return service.findQuestions(qid);
	}
	
	//http://localhost:8383/admin/createQuiz
	@RequestMapping(value = "/admin/createQuiz",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String addQuestions(@RequestBody Quiz quiz) {		// scan the value from reqeust body in the form json 
		return service.createQuiz(quiz);
	}
    
	//http://localhost:8383/getAllQuiz
	@RequestMapping(value="getAllQuiz", method=RequestMethod.GET , produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Quiz> getAllQuiz(){
		return service.getAllQuiz();
	}
	
	//http://localhost:8383/participants/takeQuiz
	@RequestMapping(value = "/participants/takeQuiz",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String takeQuiz(@RequestBody UserQuiz qsqu) {		// scan the value from reqeust body in the form json 
		return service.takeQuiz(qsqu);
	}
	
	//http://localhost:8383/checkReultByUserQuizId
	@RequestMapping(value="checkResultByUserQuizId/{userquizid}", method=RequestMethod.GET , consumes=MediaType.APPLICATION_JSON_VALUE)
	public String checkResult(@PathVariable("userquizid") int userquizid) {
		return service.checkResult(userquizid);
	}
	
	
}
	 


