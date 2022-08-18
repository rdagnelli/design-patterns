package com.robertod.structural.decorator;

public class RedPizza extends Pizza {

	@Override
	public String getName() {
		return "Red pizza";
	}

	@Override
	public double getPrice() {
		return 3.0;
	}

}
