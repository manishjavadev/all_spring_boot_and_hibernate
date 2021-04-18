package com.manish.javadev.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manish.javadev.model.Employee;

@Repository
public interface EmployeeServiceDao extends CrudRepository<Employee, Long> {

	Slice<Employee> findEmployeeByCity(String city, Pageable pageable);

}
