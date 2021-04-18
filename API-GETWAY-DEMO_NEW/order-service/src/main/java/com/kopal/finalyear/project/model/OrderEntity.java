package com.kopal.finalyear.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDER_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

	@Id
	@GeneratedValue
	private Integer orderId;
	private String orderName;
	private Integer orderQuentity;
	private Double orderPrice;

}
