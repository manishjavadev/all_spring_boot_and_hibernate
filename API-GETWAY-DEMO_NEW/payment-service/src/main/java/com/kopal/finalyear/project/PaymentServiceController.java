package com.kopal.finalyear.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kopal.finalyear.project.model.PaymentEntity;

@RestController
@RequestMapping(value = "/api/payment")
public class PaymentServiceController {

	@Autowired
	private PaymentService paymentService;
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping(value = "/doPayment")
	public PaymentEntity bookOrder(@RequestBody PaymentEntity payment) {
		
		
		
		return paymentService.saveOrder(payment);

	}

	@GetMapping("/ping")
	public String ping() {
		return "Hello SpringBoot";
	}
}
