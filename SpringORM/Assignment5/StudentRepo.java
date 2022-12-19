package com.yash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yash.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{
//	@Query(nativeQuery = true, value = "select * from vinod")
//	public List<vinod> show_all();
}
