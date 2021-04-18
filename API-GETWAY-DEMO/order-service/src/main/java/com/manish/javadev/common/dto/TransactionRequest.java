package com.manish.javadev.common.dto;

import com.manish.javadev.model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
	private Order order;
	private Payment payment;

}
