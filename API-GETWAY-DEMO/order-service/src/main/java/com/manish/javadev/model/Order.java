package com.manish.javadev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "ORDER_TBL")

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer quantity;
	private Double price;

}
