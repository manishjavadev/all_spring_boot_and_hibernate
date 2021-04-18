package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_STUDENT")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)	
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "STU_SID")
	private int sid;

	@Column(name = "STU_NAME")
	private String studentName;

	@Column(name = "STU_CITY")
	private String city;

	public Student() {
	}

	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
