package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STU_SID")
	private int sid;

	@Column(name = "STU_FIRST_NAME")
	private String firstName;

	@Column(name = "STU_LAST_NAME")
	private String lastName;

	@Column(name = "STU_STREAM")
	private String stream;

	@Column(name = "STU_DOB")
	private String dob;

	public Student() {

	}

	public Student(String firstName, String lastName, String stream, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.stream = stream;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", stream=" + stream
				+ ", dob=" + dob + "]";
	}

}
