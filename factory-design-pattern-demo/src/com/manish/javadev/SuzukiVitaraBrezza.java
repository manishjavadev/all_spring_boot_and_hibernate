package com.manish.javadev;

public class SuzukiVitaraBrezza implements Car {

	@Override
	public int maxSpeed() {
		return 220;
	}

	@Override
	public String display() {
		return "Suzuki Vitara Brezza Look";
	}
}
