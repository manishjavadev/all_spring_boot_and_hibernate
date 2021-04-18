package com.manish.javadev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.javadev.dao.EmployeeServiceDao;
import com.manish.javadev.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeServiceDao employeeServiceDao;

	@Override
	public void updateEmployeeByEmployeeId(int age, Long empid) {
		employeeServiceDao.updateEmployeeByEmployeeId(age, empid);
	}

}
