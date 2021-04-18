package com.manish.javadev.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootDemoAppApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(FirstSpringBootDemoAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootDemoAppApplication.class, args);
		LOGGER.debug("Logger from DEBUG");
		LOGGER.info("Logger from INFO");
		LOGGER.warn("Logger from WARN");
		LOGGER.error("Logger from ERROR");
	}
}
