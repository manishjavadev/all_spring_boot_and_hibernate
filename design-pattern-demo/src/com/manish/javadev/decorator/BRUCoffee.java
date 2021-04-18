package com.manish.javadev.decorator;

public class BRUCoffee implements Beverage {

	@Override
	public int cost() {
		// Base price of XCoffee
		return 30;
	}

	@Override
	public String description() {
		return "BRU-Coffee";
	}
}
