package com.robertod.structural.decorator;

public class SpicyDecorator extends PizzaDecorator {

	public SpicyDecorator(Pizza pizza) {
		super.pizza = pizza;
	}
	
	@Override
	public String getName() {
		return pizza.getName().concat(", Spicy");
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.2;
	}
	
}
