package com.service;
import java.util.List;
import java.util.Optional;



import com.bean.Questions;
import com.bean.Quiz;
import com.bean.QuizResult;
import com.bean.UserQuiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.repository.QuestionRepository;
import com.repository.QuizRepository;
import com.repository.QuizResultRepository;
import com.repository.UserQuizRepository;


@Service
public class OnlineService {
	

	
	@Autowired
	QuestionRepository quesrepo;
	
	@Autowired
	QuizRepository quizrepo;
	
	@Autowired
	UserQuizRepository userquizrepo;
	
	@Autowired
	QuizResultRepository quizresultrepo;
	
	
public String addQuestions(Questions quest) {
	
	Optional<Questions> op = quesrepo.findById(quest.getQid());
	if(op.isPresent()) {
		return "try adding again , this question exist";
	}else {
			quesrepo.save(quest);				// insert new records
			return "question added successfully";
	}
}

public String updateQuestions(Questions ques) {
	Optional<Questions> op = quesrepo.findById(ques.getQid());
	if(op.isPresent()) {
			 	Questions e	= op.get();
			 	e.setQuestion(ques.getQuestion());
			 	e.setOption1(ques.getOption1());
			 	e.setOption2(ques.getOption2());
			 	e.setOption3(ques.getOption3());
			 	e.setOption4(ques.getOption4());
			 	e.setAnswer(ques.getAnswer());
			 	quesrepo.saveAndFlush(e);			// update 	existing record update property 
			 	return "Question and option updated successfully";
	}else {
			
			return "Question and option not updated";
	}
}

public String deleteQuestions(int qid) {
	Optional<Questions> op = quesrepo.findById(qid);
	if(op.isPresent()) {
					Questions e = op.get();
					quesrepo.delete(e);
		return "Question deleted successfully";
	}else {
			return "Question not deleted";
	}
}




public String findQuestions(int qid) {
	Optional<Questions> op = quesrepo.findById(qid);
	if(op.isPresent()) {
		Questions e = op.get();
		return e.toString();
	}else {
		return "try to enter unique question id!!!";
	}
}

public String createQuiz(Quiz quiz) {
	
	Optional<Quiz> op = quizrepo.findById(quiz.getQuiztoken());
	if(op.isPresent()) {
		return "quiz id exits try again";
	}else {
			quizrepo.save(quiz);				// insert new records
			return "quiz create ssuccessfully";
	}
}

public List<Quiz> getAllQuiz(){
	return quizrepo.findAll();
	
}

public String takeQuiz(UserQuiz emp) {
	Optional<UserQuiz> op = userquizrepo.findById(emp.getUserquizid());
	if(op.isPresent()) {
		return "Answer not submitted , try Again !!!";
	}else {
			userquizrepo.save(emp);				// insert new records
			return "Answer Submitted";
	}
}

public String checkResult(int userquizid) {
	Optional<QuizResult> op = quizresultrepo.findById(userquizid);
	if(op.isPresent()) {
		QuizResult e = op.get();
		return e.toString();
	}else {
		return "try to enter correct quizid!!!";
	}
}

}
