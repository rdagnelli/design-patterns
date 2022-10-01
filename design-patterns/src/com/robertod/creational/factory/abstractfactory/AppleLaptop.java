package com.robertod.creational.factory.abstractfactory;

import com.robertod.Utils;

public class AppleLaptop extends Laptop {

	public AppleLaptop(String model, Double price) {
		this.brand = "Apple";
		this.model = model;
		this.price = price;
	}
	
	@Override
	public void printLaptopDetails() {
		Utils.print(brand, model, price.toString());	}

}
