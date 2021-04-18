package com.kopal.finalyear.project.model;

public class User {
	private Integer userId;
	private String firstname;
	private String lastname;
	private int age;

	public User(Integer userId, String firstname, String lastname, int age) {
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}

}
