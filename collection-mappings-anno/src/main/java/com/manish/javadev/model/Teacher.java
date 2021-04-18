package com.manish.javadev.model;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;

public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TID")
	private int tid;

	@Id
	@Column(name = "TEACHER_NAME")
	private String teacherName;

	@ElementCollection
	@CollectionTable(name = "SUBJECT", joinColumns = @JoinColumn(name = "TID"))
	@OrderColumn(name = "idx")
	@Column(name = "TEACHER_SUBJECT")
	private String[] subject;

	public Teacher() {
		super();
	}

	public Teacher(int tid, String teacherName, String[] subject) {
		super();
		this.tid = tid;
		this.teacherName = teacherName;
		this.subject = subject;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

}
