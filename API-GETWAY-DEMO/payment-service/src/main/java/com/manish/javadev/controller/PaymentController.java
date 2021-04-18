package com.manish.javadev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.manish.javadev.model.Payment;
import com.manish.javadev.service.PaymentService;

@RestController
@RequestMapping(value = "/api/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@PostMapping(value = "/savePayment")
	public Payment savePayment(@RequestBody Payment payment) throws JsonProcessingException {
		return paymentService.savePayment(payment);
	}

	@GetMapping(value = "/findAllPayment")
	public Iterable<Payment> findAllPayment() {
		return paymentService.findAllPayment();
	}

	@GetMapping(value = "/ping")
	public String ping() {

		return "ping working";
	}

}
