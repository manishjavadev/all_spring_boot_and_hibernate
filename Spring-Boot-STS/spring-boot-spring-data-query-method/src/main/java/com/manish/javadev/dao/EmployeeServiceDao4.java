package com.manish.javadev.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.manish.javadev.model.Employee;

@Repository
public interface EmployeeServiceDao4 extends CrudRepository<Employee, Long> {

	// Query
	@Query(value = "SELECT * FROM tbl_Employee e WHERE e.last_name=:lastname", nativeQuery = true)
	List<Employee> findEmployeeByLastname(String lastname);

	@Query(value = "SELECT * FROM tbl_Employee e WHERE e.last_name=:lastname and e.age=:age", nativeQuery = true)
	List<Employee> findEmployeeByLastnameAndAge(String lastname, int age);

}
