package com.manish.javadev.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long stuId;
	private String studentBranch;
	private String studentLocation;

	public StudentId() {
		super();
	}

	public StudentId(long stuId, String studentBranch, String studentLocation) {
		super();
		this.stuId = stuId;
		this.studentBranch = studentBranch;
		this.studentLocation = studentLocation;
	}

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public String getStudentLocation() {
		return studentLocation;
	}

	public void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}

	@Override
	public String toString() {
		return "StudentId [stuId=" + stuId + ", studentBranch=" + studentBranch + ", studentLocation=" + studentLocation
				+ "]";
	}

}
