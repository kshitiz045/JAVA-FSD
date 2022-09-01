package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bean.UserQuiz;

@Repository
public interface UserQuizRepository extends JpaRepository<UserQuiz, Integer>{

}