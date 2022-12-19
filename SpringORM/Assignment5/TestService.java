package com.yash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Test;
import com.yash.repo.TestRepo;

@Service
public class TestService {

	@Autowired
	TestRepo testrepo;
	public List<Test> getAllTest() 
	{
		return testrepo.findAll();		 
	}
	public Optional<Test> getById(int testid) 
	{
		System.out.println("Test "+testid);
		Optional<Test> findById = testrepo.findById(testid);
		return findById;
	}

	
}
