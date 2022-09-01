package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.QuizResult;

@Repository
public interface QuizResultRepository extends JpaRepository<QuizResult, Integer>{

}