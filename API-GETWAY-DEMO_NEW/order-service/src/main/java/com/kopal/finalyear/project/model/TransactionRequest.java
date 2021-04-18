package com.kopal.finalyear.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
	private OrderEntity orderEntity;
	private PaymentEntity paymentEntity;

}
