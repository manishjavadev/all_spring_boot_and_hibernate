package com.kopal.finalyear.project;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kopal.finalyear.project.model.PaymentEntity;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepo paymentRepo;

	@Override
	public PaymentEntity saveOrder(PaymentEntity paymentEntity) {
		paymentEntity.setTxnId(UUID.randomUUID().toString());
		paymentEntity.setPaymentStatus(paymentEntity.getOrderId() % 2 == 0 ? "SUCCESS" : "FAILED");
		PaymentEntity payment = paymentRepo.save(paymentEntity);
		return payment;
	}

}
