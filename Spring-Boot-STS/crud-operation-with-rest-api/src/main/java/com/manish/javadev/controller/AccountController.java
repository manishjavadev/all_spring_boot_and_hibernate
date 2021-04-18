package com.manish.javadev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manish
 *
 */
@RestController
@RequestMapping("/api")

public class AccountController {

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public boolean ping() {
		return true;

	}
}