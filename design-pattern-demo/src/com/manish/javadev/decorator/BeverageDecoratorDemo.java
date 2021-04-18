package com.manish.javadev.decorator;

public class BeverageDecoratorDemo {
	public static void main(String[] args) {
		Beverage beverage = new BRUCoffee();
		CoffeeWithNuts coffeeWithNuts = new CoffeeWithNuts(beverage);

		System.out.println("Base price is " + beverage.cost() + ", Total price is " + coffeeWithNuts.cost());
		System.out.println(coffeeWithNuts.description());
	}
}
