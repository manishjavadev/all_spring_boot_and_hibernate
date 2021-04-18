package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ADHAR")
public class AdharDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADHAR_ID")
	private Integer adharId;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ADHAR_NUMBER")
	private String adharNumber;

	@OneToOne(mappedBy = "adharDetail")
	private UserDetail userDetail;

	public AdharDetail() {
	}

	public AdharDetail(String city, String state, String adharNumber) {
		super();
		this.city = city;
		this.state = state;
		this.adharNumber = adharNumber;
	}

	public Integer getAdharId() {
		return adharId;
	}

	public void setAdharId(Integer adharId) {
		this.adharId = adharId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}