package com.manish.javadev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.manish.javadev.dao.EmployeeServiceDao;
import com.manish.javadev.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeServiceDao employeeServiceDao;

	@Override
	public List<Employee> saveMultipleEmployee(List<Employee> employeeList) {
		return (List<Employee>) employeeServiceDao.saveAll(employeeList);
	}

	@Override
	public Slice<Employee> findEmployeeByCity(String city, Pageable pageable) {
		return employeeServiceDao.findEmployeeByCity(city, pageable);
	}

}
