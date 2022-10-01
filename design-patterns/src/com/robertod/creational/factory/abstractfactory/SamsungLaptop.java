package com.robertod.creational.factory.abstractfactory;

import com.robertod.Utils;

public class SamsungLaptop extends Laptop {

	public SamsungLaptop(String model, Double price) {
		this.brand = "Samsung";
		this.model = model;
		this.price = price;
	}
	
	@Override
	public void printLaptopDetails() {
		Utils.print(brand, model, price.toString());
	}

}
