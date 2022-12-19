package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Teacher;
import com.yash.repo.TeacherRepo;

@Service
public class TeacherService
{
	@Autowired
	TeacherRepo teacherrepo;
	
	public List<Teacher> all_list()
	{
		return teacherrepo.findAll();
	}

//	public List<Teacher> que_by_each() 
//	{
//		return teacherrepo.findAll();
//	}
}
