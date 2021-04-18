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
	public String ping() {
		return "Configuration is working...";
	}

	@RequestMapping(value = "/testlogger")
	public String helloLog() {
		LOGGER.debug("Logger Message DEBUG Level");
		LOGGER.info("Logger Message INFO Level");
		LOGGER.warn("Logger Message WARN Level");
		LOGGER.error("Logger Message ERROR Level");

		/*
		 * For Error log manually we are throwing number format exception to test its
		 * logging in error file or not.
		 */
		String data = "manish";
		Integer result = Integer.parseInt(data);
		return String.valueOf(result);
	}
}