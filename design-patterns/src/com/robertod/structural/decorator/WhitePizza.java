package com.robertod.structural.decorator;

public class WhitePizza extends Pizza {

	@Override
	public String getName() {
		return "White pizza";
	}

	@Override
	public double getPrice() {
		return 2.5;
	}

}
