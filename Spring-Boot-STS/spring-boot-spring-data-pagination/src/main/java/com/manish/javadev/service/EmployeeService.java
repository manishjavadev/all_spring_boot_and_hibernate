package com.manish.javadev.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import com.manish.javadev.model.Employee;

public interface EmployeeService {

	List<Employee> saveMultipleEmployee(List<Employee> employeeList);

	Slice<Employee> findEmployeeByCity(String city, Pageable pageable);

}
