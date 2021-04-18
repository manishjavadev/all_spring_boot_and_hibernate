package com.manish.javadev.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "online guitar learning", description = "online guitar learning Application")
@RequestMapping(value = "/accountcontroller")
public class AccountController {

	@ApiOperation(value = "Find User By User Id")
	@RequestMapping(value = "/createacc", method = RequestMethod.GET)
	public String createAccount() {
		String data = "Manish";
		Integer result = Integer.parseInt(data);
		return String.valueOf(result);
	}

}
