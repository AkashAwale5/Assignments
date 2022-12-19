package com.yash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.model.Test_questions;

public interface Test_QuestionRepo extends JpaRepository<Test_questions, Integer> {

}
