package com.manish.javadev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value = "/")
	public boolean ping() {
		return true;
	}

	@RequestMapping(value = "/hello")
	public String helloWorld() {
		return "Hello World";
	}
}