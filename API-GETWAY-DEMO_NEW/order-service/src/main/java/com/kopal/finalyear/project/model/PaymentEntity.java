package com.kopal.finalyear.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEntity {

	private Integer paymentId;
	private String paymentStatus;
	private String txnId;
	private Integer orderId;
	private Double paymentAmount;
}
