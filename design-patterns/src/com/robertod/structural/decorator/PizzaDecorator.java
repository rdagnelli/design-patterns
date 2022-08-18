package com.robertod.structural.decorator;

public abstract class PizzaDecorator extends Pizza {
	
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}
	
}
