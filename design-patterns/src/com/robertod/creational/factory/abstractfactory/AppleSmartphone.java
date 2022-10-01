package com.robertod.creational.factory.abstractfactory;

import com.robertod.Utils;

public class AppleSmartphone extends Smartphone {

	public AppleSmartphone(String model, Double price) {
		this.brand = "Apple";
		this.model = model;
		this.price = price;
	}
	
	@Override
	public void printSmartphoneDetails() {
		Utils.print(brand, model, price.toString());
	}

}
