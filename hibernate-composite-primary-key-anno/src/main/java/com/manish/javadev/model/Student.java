package com.manish.javadev.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_STUDENT")
public class Student {

	@Id
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "stuId", column = @Column(name = "STU_ID")),
			@AttributeOverride(name = "studentBranch", column = @Column(name = "STU_BRANCH")),
			@AttributeOverride(name = "studentLocation", column = @Column(name = "STU_LOCATION")) })
	private StudentId studentId;

	@Column(name = "STU_FIRST_NAME")
	private String firstName;

	@Column(name = "STU_LAST_NAME")
	private String lastName;

	@Column(name = "STU_DOB")
	private String dob;

	public Student() {

	}

	public Student(StudentId studentId, String firstName, String lastName, String dob) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public StudentId getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentId studentId) {
		this.studentId = studentId;
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
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", getStudentId()=" + getStudentId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getDob()=" + getDob() + "]";
	}

}
