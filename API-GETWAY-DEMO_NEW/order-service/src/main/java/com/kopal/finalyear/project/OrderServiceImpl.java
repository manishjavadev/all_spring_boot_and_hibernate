package com.kopal.finalyear.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kopal.finalyear.project.model.OrderEntity;
import com.kopal.finalyear.project.model.PaymentEntity;
import com.kopal.finalyear.project.model.TransactionRequest;
import com.kopal.finalyear.project.model.TransactionResponse;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepo orderRepo;
	@Autowired
	private RestTemplate restTemplate;

	@Value("${microservice.payment-service.endpoints.endpoint.uri}")
	private String PAYMENT_ENDPOINT;
	@Value("${microservice.order-service.endpoints.endpoint.uri}")
	private String ORDER_ENDPOINT;

	@Override
	public TransactionResponse saveOrder(TransactionRequest transactionrequest) {

		OrderEntity orderEntity = transactionrequest.getOrderEntity();
		OrderEntity order = orderRepo.save(orderEntity);

		PaymentEntity paymentEntity = transactionrequest.getPaymentEntity();
		paymentEntity.setPaymentAmount(order.getOrderPrice());
		paymentEntity.setOrderId(order.getOrderId());

		ResponseEntity<PaymentEntity> postForEntity = restTemplate.postForEntity(PAYMENT_ENDPOINT, paymentEntity,
				PaymentEntity.class);

		TransactionResponse transactionResponse = new TransactionResponse();
		transactionResponse.setOrderEntity(order);
		transactionResponse.setPaymentEntity(postForEntity.getBody());
		return transactionResponse;

	}

	@Override
	public String getData() {
		
		return ORDER_ENDPOINT;
	}

}
