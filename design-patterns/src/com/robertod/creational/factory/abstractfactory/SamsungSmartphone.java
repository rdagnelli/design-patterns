package com.robertod.creational.factory.abstractfactory;

import com.robertod.Utils;

public class SamsungSmartphone extends Smartphone {

	public SamsungSmartphone(String model, Double price) {
		this.brand = "Samsung";
		this.model = model;
		this.price = price;
	}
	
	@Override
	public void printSmartphoneDetails() {
		Utils.print(brand, model, price.toString());
	}

}
