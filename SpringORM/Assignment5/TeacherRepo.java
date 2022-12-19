package com.yash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yash.model.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Long>
{
	//select count(*),teacher.techerid,teacher.teachername from teacher join test on test.obj_techerid = teacher.techerid group by teachername
//	@Query(nativeQuery = true, value = "select count(*),teachername from teacher")
//	public List<Teacher> show_test_count();
}
