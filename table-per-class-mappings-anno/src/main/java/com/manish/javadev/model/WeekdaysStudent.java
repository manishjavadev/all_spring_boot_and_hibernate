package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("WKD_STU")
public class WeekdaysStudent extends Student {

	@Column(name = "QUALIFI")
	private String qualification;
	@Column(name = "PERCENTAGE")
	private String percentage;
	@Column(name = "TIMINGS")
	private String timings;
	@Column(name = "BRANCH")
	private String branch;

	public WeekdaysStudent() {
	}

	public WeekdaysStudent(String studentName, String city, String qualification, String percentage, String timings,
			String branch) {
		super(studentName, city);
		this.qualification = qualification;
		this.percentage = percentage;
		this.timings = timings;
		this.branch = branch;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
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
		return "WeekdaysStudent [qualification=" + qualification + ", percentage=" + percentage + ", timings=" + timings
				+ ", branch=" + branch + ", getQualification()=" + getQualification() + ", getPercentage()="
				+ getPercentage() + ", getTimings()=" + getTimings() + ", getBranch()=" + getBranch() + ", getSid()="
				+ getSid() + ", getStudentName()=" + getStudentName() + ", getCity()=" + getCity() + "]";
	}

}