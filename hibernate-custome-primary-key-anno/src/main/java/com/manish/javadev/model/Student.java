package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBL_STUDENT")
public class Student {

	@Id
	@GenericGenerator(name = "stu_id", strategy = "com.manish.javadev.model.StudentIdGenerator")
	@GeneratedValue(generator = "stu_id")
	@Column(name = "STUDENT_ID")
	private String sid;

	@Column(name = "STU_FIRST_NAME")
	private String firstName;

	@Column(name = "STU_LAST_NAME")
	private String lastName;

	@Column(name = "STU_DOB")
	private String dob;

	public Student() {

	}

	public Student(String firstName, String lastName, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public String getCid() {
		return sid;
	}

	public void setCid(String sid) {
		this.sid = sid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}

}
