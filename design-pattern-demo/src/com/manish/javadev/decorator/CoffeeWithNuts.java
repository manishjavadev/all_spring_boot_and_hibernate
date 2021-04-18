package com.manish.javadev.decorator;

public class CoffeeWithNuts implements BeverageDecorator {
	private Beverage beverage;

	public CoffeeWithNuts(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int cost() {

		// Get the Base price of XCoffee
		int basePrice = beverage.cost();

		// Add CoffeeWithNuts price
		basePrice = basePrice + 20;
		return basePrice;
	}

	@Override
	public String description() {
		// description about coffee
		return beverage.description() + "Added with " + " Nuts flavour";
	}

}
