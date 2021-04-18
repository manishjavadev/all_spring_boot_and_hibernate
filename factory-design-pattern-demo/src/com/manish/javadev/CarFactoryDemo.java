package com.manish.javadev;

public class CarFactoryDemo {

	String str = "Manish";

	public static void main(String[] args) {
		CarFactoryCreater carFactoryCreater = new CarFactoryCreaterImpl();
		Car car = carFactoryCreater.carFactoryCreater("HondaCity");
		System.out.println("Car Display Type  : " + car.display());
		System.out.println("Car Max Speed : " + car.maxSpeed());
	}

}
