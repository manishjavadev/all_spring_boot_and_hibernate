package com.manish.javadev.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ITEM")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ITEM_ID")
	private int itemId;

	@Column(name = "ITEM_NAME")
	private String itemName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ORDER_ID_FK")
	private Order order;

	public Item() {
	}

	public Item(String itemName, Order order) {
		super();
		this.itemName = itemName;
		this.order = order;
	}

}
