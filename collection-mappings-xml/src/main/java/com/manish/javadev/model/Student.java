package com.manish.javadev.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;

import org.hibernate.annotations.IndexColumn;

@Entity(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STU_SID")
	private int sid;

	@Column(name = "STU_NAME")
	private String studentName;

	@Column(name = "STU_STREAM")
	private String stream;

	@Column(name = "STU_DOB")
	private String dob;

	@ElementCollection
	@CollectionTable(name = "EMAIL", joinColumns = @JoinColumn(name = "STU_SID"))
	@OrderColumn(name = "idx")
	@Column(name = "STU_EMAIL")
	private List<String> email;

	@ElementCollection
	@CollectionTable(name = "COURSE", joinColumns = @JoinColumn(name = "STU_SID"))
	@OrderColumn(name = "idx")
	@Column(name = "STU_COURSE")
	private String[] cource;

	@ElementCollection
	@CollectionTable(name = "PHONE", joinColumns = @JoinColumn(name = "STU_SID"))
	@Column(name = "STU_PHONE")
	private Set<Long> phoneNumber;

	@ElementCollection
	@CollectionTable(name = "COURSE_TEACHER", joinColumns = @JoinColumn(name = "STU_SID"))
	@IndexColumn(name = "TEACHER")
	@Column(name = "STU_NAME")
	private Map<String, String> courseAndTeacher;

	public Student() {

	}

	public Student(String studentName, String stream, String dob, List<String> email, String[] cource,
			Set<Long> phoneNumber, HashMap<String, String> courseAndTeacher) {
		super();
		this.studentName = studentName;
		this.stream = stream;
		this.dob = dob;
		this.email = email;
		this.cource = cource;
		this.phoneNumber = phoneNumber;
		this.courseAndTeacher = courseAndTeacher;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public String[] getCource() {
		return cource;
	}

	public void setCource(String[] cource) {
		this.cource = cource;
	}

	public Set<Long> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Map<String, String> getCourseAndTeacher() {
		return courseAndTeacher;
	}

	public void setCourseAndTeacher(Map<String, String> courseAndTeacher) {
		this.courseAndTeacher = courseAndTeacher;
	}

}
