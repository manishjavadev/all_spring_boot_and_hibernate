package com.manish.javadev.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

	private Integer paymentId;
	private String status;
	private String txnId;
	private Integer orderId;
	private Double amount;

}
