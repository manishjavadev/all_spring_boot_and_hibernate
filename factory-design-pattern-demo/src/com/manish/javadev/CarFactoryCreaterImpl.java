package com.manish.javadev;

public class CarFactoryCreaterImpl implements CarFactoryCreater {
	private Car car;

	public Car carFactoryCreater(String decider) {
		if (decider.equals("HondaCity")) {
			car = new HondaCity();
		} else if (decider.equals("MahindraXUV")) {
			car = new MahindraXUV();
		} else if (decider.equals("Suzuki")) {
			car = new SuzukiVitaraBrezza();
		}
		return car;
	}
}
