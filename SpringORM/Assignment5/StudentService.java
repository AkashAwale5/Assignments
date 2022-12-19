package com.yash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Student;
import com.yash.repo.StudentRepo;

@Service
public class StudentService
{

	@Autowired
	StudentRepo stRepo;
	public List<Student> getStudentMarks() 
	{
		
		return stRepo.findAll();
	}
	public Optional<Student> getStudentbyID(int sid)
	{
		
		return stRepo.findById(sid);
	}
	public List<Student> getAllStudent() 
	{
		
		return stRepo.findAll();
	}
	
	
}
