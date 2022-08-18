package com.robertod.structural.decorator;

public class MushroomsDecorator extends PizzaDecorator {

	public MushroomsDecorator(Pizza pizza) {
		super.pizza = pizza;
	}
	
	@Override
	public String getName() {
		return pizza.getName().concat(", Mushrooms");
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.6;
	}
	
}
