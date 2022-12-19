package com.yash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.yash.model.Test;

public interface TestRepo extends JpaRepository<Test, Integer>
{
//	@Query(nativeQuery = true, value = "select count(*) obj_techerid from test group by obj_techerid")
//	public List<Test> show_test();
}
