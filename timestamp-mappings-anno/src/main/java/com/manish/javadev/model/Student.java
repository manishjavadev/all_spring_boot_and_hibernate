package com.manish.javadev.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "TBL_STUDENT")
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

	@Column(name = "LAST_MODIFIED_DATE", insertable = false, 
			updatable = false, 
			columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@org.hibernate.annotations.Generated(org.hibernate.annotations.GenerationTime.ALWAYS)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModified;

	public Student() {

	}

	public Student(String studentName, String stream, String dob) {
		super();
		this.studentName = studentName;
		this.stream = stream;
		this.dob = dob;
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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentName=" + studentName + ", stream=" + stream + ", dob=" + dob
				+ ", lastModified=" + lastModified + ", getSid()=" + getSid() + ", getStudentName()=" + getStudentName()
				+ ", getStream()=" + getStream() + ", getDob()=" + getDob() + "]";
	}
}
