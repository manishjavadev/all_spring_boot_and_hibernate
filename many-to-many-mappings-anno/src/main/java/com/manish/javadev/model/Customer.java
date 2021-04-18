package com.manish.javadev.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	private Integer customerId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "AGE")
	private int age;

	/*
	 * What mappedBy: mappedBy attribute tell Hibernate/JPA that one table owns
	 * the relationship, hence it is stored as a column in a table.
	 * 
	 * Without mappedBy attribute, relationship is external, Hibernate/JPA
	 * create another table to hold the relationship. *
	 * 
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "TBL_CUSTOMER_ACCOUNT", 
		joinColumns = @JoinColumn(name = "CUSTOMER_ID_FK",referencedColumnName = "CUSTOMER_ID"), 
			inverseJoinColumns = @JoinColumn(name = "ACCOUNT_ID_FK", referencedColumnName = "ACCOUNT_ID"))
	private Set<Account> account;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Account> getAccount() {
		return account;
	}

	public void setAccount(Set<Account> account) {
		this.account = account;
	}

}