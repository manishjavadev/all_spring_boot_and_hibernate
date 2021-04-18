package com.manish.javadev.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manish.javadev.model.Employee;

@Repository
public interface EmployeeServiceDao2 extends CrudRepository<Employee, Long> {

	List<Employee> findByLastname(String lastname);

	List<Employee> findByLastnameEquals(String lastname);

	List<Employee> findByLastnameNot(String lastname);

	List<Employee> findByLastnameAndAge(String lastname, int age);

	List<Employee> findByLastnameLike(String lastname);

	List<Employee> findByLastnameNotLike(String lastname);

	List<Employee> findByLastnameStartingWith(String lastname);

	List<Employee> findByLastnameEndingWith(String lastname);

	List<Employee> findByLastnameContaining(String lastname);

	List<Employee> findByAgeLessThan(int age);

	List<Employee> findByAgeLessThanEqual(int age);

	List<Employee> findByAgeGreaterThanAndAgeLessThan(int minAge, int maxAge);

	List<Employee> findByAgeBefore(int age);

	List<Employee> findByAgeBetween(int i, int j);

	List<Employee> findByLastnameIsNull();

	List<Employee> findByLastnameIsNotNull();

	List<Employee> findByLastnameNotNull();

	List<Employee> findByLastnameIn(List<String> nameList);

	List<Employee> findByLastnameNotIn(List<String> nameList);

	List<Employee> findByLastnameOrderBySalary(String lastname);

	List<Employee> findByLastnameOrderBySalaryDesc(String string);

	List<Employee> findFirstByLastname(String string);

	List<Employee> findTop5ByLastname(String string);

	List<Employee> findDistinctEmployeeByCityAndLastname(String city, String string);

}
