package com.yash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.model.Student_test_attempt;

public interface Student_testRepo extends JpaRepository<Student_test_attempt, Long>
{
}