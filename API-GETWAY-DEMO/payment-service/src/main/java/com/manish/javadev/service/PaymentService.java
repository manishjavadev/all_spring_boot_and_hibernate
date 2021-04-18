package com.manish.javadev.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.manish.javadev.model.Payment;
import com.manish.javadev.respository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	private Logger logger = LoggerFactory.getLogger(PaymentService.class);

	public Payment savePayment(Payment paymentRequest) throws JsonProcessingException {
		paymentRequest.setTxnId(UUID.randomUUID().toString());
		doPaymentWithBank(paymentRequest);

		logger.info("Payment request from Payment Service : {}", new ObjectMapper().writeValueAsString(paymentRequest));
		Payment paymentResponse = paymentRepository.save(paymentRequest);
		
		logger.info("Payment Response from Payment Service : {}",
				new ObjectMapper().writeValueAsString(paymentResponse));
		// paymentResponse.setStatus("SUCCESS");
		return paymentResponse;
	}

	private void doPaymentWithBank(Payment payment) {
		if (payment.getOrderId() % 2 == 0) {
			payment.setStatus("SUCCESS");
		} else {
			payment.setStatus("FAILED");
		}
	}

	public Iterable<Payment> findAllPayment() {
		return paymentRepository.findAll();
	}
}
