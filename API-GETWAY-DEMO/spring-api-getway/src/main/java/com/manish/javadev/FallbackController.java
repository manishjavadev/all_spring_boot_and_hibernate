package com.manish.javadev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@RequestMapping("/orderFallBack")
	public Mono<String> orderServiceFallBack() {
		return Mono.just("Order Service is down, Please try after sometime");
	}

	@RequestMapping("/paymentFallback")
	public Mono<String> paymentServiceFallBack() {
		return Mono.just("Payment Service is down, Please try after sometime");
	}
}
