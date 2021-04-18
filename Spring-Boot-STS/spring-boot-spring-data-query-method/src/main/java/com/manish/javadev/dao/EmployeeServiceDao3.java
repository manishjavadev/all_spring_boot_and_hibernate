package com.manish.javadev.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.manish.javadev.model.Employee;

@Repository
public interface EmployeeServiceDao3 extends CrudRepository<Employee, Long> {

	// Query
	@Query("SELECT e FROM Employee e WHERE e.lastname=:lastname")
	List<Employee> findEmployeeByLastname(@Param("lastname") String lastname);

	@Query("SELECT e FROM Employee e WHERE e.lastname=:lastname and e.age=:age")
	List<Employee> findEmployeeByLastnameAndAge(@Param("lastname") String lastname, @Param("age") int age);

}
