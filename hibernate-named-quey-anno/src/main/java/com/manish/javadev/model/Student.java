package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "TBL_STUDENT")
@NamedQueries({ @NamedQuery(name = "ALL_STUDENT_RECORD", query = "from Student stu"),
		@NamedQuery(name = "FIND_ALL_STUDENT_FIRST_NAME", query = "SELECT stu.firstName from Student stu"),
		@NamedQuery(name = "FIND_FIRST_NAME_AND_LAST_NAME", query = "SELECT  stu.firstName, stu.lastName from Student stu"),
		@NamedQuery(name = "FIND_BY_ID_WITH_POSITION", query = "from Student stu  WHERE stu.sid=?"),
		@NamedQuery(name = "FIND_BY_ID_AND_NAME_WITH_POSITION", query = "from Student stu WHERE stu.sid=? and stu.firstName=?"),
		@NamedQuery(name = "FIND_BY_ID_WITH_NAMED_PLACEHOLDER", query = "from Student stu WHERE stu.sid=:studentId"),
		@NamedQuery(name = "FIND_BY_ID_AND_NAME_WITH_NAMED_PLACEHOLDER", query = "from Student stu WHERE stu.sid=:studentId and stu.firstName=:studentFirstName"),
		@NamedQuery(name = "UPDATE_BY_ID", query = "Update Student stu set firstName = :studentFirstName WHERE stu.sid=:studentId"),
		@NamedQuery(name = "DELETE_BY_ID", query = "Delete from Student stu WHERE stu.sid=:studentId") })

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
