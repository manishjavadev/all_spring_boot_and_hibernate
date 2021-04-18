package com.manish.javadev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.manish.javadev.common.dto.TransactionRequest;
import com.manish.javadev.common.dto.TransactionResponse;
import com.manish.javadev.service.OrderService;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping(value = "/saveOrder")
	public TransactionResponse saveOrder(@RequestBody TransactionRequest transactionRequest)
			throws JsonProcessingException {
		return orderService.saveOrder(transactionRequest);
	}

	@GetMapping(value = "/ping")
	public String ping() {

		return "ping working";
	}

}
