package com.manish.javadev;

public class HondaCity implements Car {

	@Override
	public int maxSpeed() {
		return 300;
	}

	@Override
	public String display() {
		return "Honda City Look";
	}
}
