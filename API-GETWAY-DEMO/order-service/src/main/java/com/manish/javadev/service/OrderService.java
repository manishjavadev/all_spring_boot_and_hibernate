package com.manish.javadev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.manish.javadev.common.dto.Payment;
import com.manish.javadev.common.dto.TransactionRequest;
import com.manish.javadev.common.dto.TransactionResponse;
import com.manish.javadev.model.Order;
import com.manish.javadev.respository.OrderRepository;

@Service
public class OrderService {

	private Logger logger = LoggerFactory.getLogger(OrderService.class);

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private RestTemplate restTemplate;

	public TransactionResponse saveOrder(TransactionRequest transactionRequest) throws JsonProcessingException {

		Order orderRequest = transactionRequest.getOrder();
		Payment payment = transactionRequest.getPayment();

		logger.info("Order request : {}", new ObjectMapper().writeValueAsString(orderRequest));

		Order orderResponse = orderRepository.save(orderRequest);
		logger.info("Order response : {}", new ObjectMapper().writeValueAsString(orderResponse));

		payment.setAmount(orderResponse.getPrice());
		payment.setOrderId(orderResponse.getId());

		// TO DO rest call to payment service

		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/api/payment/savePayment", payment,
				Payment.class);
		logger.info("Payment Service invocation from Order Service : {}",
				new ObjectMapper().writeValueAsString(paymentResponse));

		return new TransactionResponse(orderResponse, paymentResponse);
	}
}
