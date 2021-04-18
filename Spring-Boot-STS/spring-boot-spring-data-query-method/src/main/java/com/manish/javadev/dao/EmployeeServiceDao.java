package com.manish.javadev.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manish.javadev.model.Employee;

@Repository
public interface EmployeeServiceDao extends CrudRepository<Employee, Long> {

	@Transactional
	@Modifying
	@Query(value = "UPDATE Employee e set e.age=:age WHERE e.employeeId=:employeeId")
	void updateEmployeeByEmployeeId(@Param("age") int age, @Param("employeeId") Long employeeId);

}
