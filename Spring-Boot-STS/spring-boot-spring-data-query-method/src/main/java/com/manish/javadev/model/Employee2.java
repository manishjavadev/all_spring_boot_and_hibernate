package com.manish.javadev.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_EMPLOYEE")
/*@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "Employee.findEmployeeByLastname", 
				query = "SELECT * FROM tbl_employee e WHERE e.last_name=?", resultClass = Employee.class),
		@NamedNativeQuery(name = "Employee.findEmployeeByLastnameAndAge", 
		query = "SELECT * FROM tbl_employee e WHERE e.last_name=? and e.age=?", resultClass = Employee.class) })*/
public class Employee2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;

	@Column(name = "FIRST_NAME")
	private String firstname;

	@Column(name = "LAST_NAME")
	private String lastname;

	@Column(name = "CITY")
	private String city;

	@Column(name = "SALARY")
	private Double salary;

	@Column(name = "AGE")
	private int age;

	public Employee2() {
		super();
	}

	public Employee2(String firstname, String lastname, String city, Double salary, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.salary = salary;
		this.age = age;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname + ", city="
				+ city + ", salary=" + salary + ", age=" + age + "]";
	}

}