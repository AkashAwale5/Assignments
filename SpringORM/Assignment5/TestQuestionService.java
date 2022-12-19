package com.yash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Test_questions;
import com.yash.repo.Test_QuestionRepo;

@Service
public class TestQuestionService
{
	@Autowired
	Test_QuestionRepo objTQRepo;

	public Optional<Test_questions> getQueBy(int qid) 
	{
		
		return objTQRepo.findById(qid);
	}

	public List<Test_questions> getAllQuestions()
	{
		return objTQRepo.findAll();
		
	}
	
}
