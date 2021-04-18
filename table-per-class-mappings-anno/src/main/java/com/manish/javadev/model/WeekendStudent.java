package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("WKE_STU")
public class WeekendStudent extends Student {
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "TIMINGS")
	private String timings;
	@Column(name = "BRANCH")
	private String branch;

	public WeekendStudent() {
	}

	public WeekendStudent(String studentName, String city, String company, String email, String timings,
			String branch) {
		super(studentName, city);
		this.company = company;
		this.email = email;
		this.timings = timings;
		this.branch = branch;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "WeekendStudent [company=" + company + ", email=" + email + ", timings=" + timings + ", branch=" + branch
				+ ", getCompany()=" + getCompany() + ", getEmail()=" + getEmail() + ", getTimings()=" + getTimings()
				+ ", getBranch()=" + getBranch() + ", getSid()=" + getSid() + ", getStudentName()=" + getStudentName()
				+ ", getCity()=" + getCity() + "]";
	}

}
