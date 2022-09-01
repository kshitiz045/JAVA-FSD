package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer>{

}