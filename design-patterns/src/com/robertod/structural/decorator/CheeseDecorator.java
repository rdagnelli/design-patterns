package com.robertod.structural.decorator;

public class CheeseDecorator extends PizzaDecorator {

	public CheeseDecorator(Pizza pizza) {
		super.pizza = pizza;
	}
	
	@Override
	public String getName() {
		return pizza.getName().concat(", Cheese");
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 1.2;
	}
	
}
