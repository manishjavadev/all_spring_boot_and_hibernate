package com.manish.javadev.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class LoggerController {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerController.class);

	@RequestMapping(value = "/ping")
	public boolean ping() {
		return true;
	}

	@RequestMapping(value = "/testlogger")
	public String helloLog() {
		LOGGER.debug("Logger Message DEBUG Level");
		LOGGER.info("Logger Message INFO Level");
		LOGGER.warn("Logger Message WARN Level");
		LOGGER.error("Logger Message ERROR Level");

		int result = 10 / 0;
		return "Hello World";
	}
}