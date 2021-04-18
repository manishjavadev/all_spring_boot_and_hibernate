package com.kopal.finalyear.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kopal.finalyear.project.model.TransactionRequest;
import com.kopal.finalyear.project.model.TransactionResponse;

@RestController
@RequestMapping(value = "/api/order")
@RefreshScope
public class OrderServiceController {

	@Autowired
	private OrderService orderService;

	@PostMapping(value = "/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest transactionrequest) {

		return orderService.saveOrder(transactionrequest);

	}

	@GetMapping("/ping")
	public String ping() {
		return "Hello SpringBoot";
	}
	@GetMapping("/pingtest")
	public String testMessage() {
		return orderService.getData();
	}
}
