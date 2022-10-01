package com.robertod.creational.factory.abstractfactory;

public class SamsungFactory implements TechAbstractFactory{

	@Override
	public Laptop createLaptop(String model, Double price) {
		return new SamsungLaptop(model, price);
	}

	@Override
	public Smartphone createSmartphone(String model, Double price) {
		return new SamsungSmartphone(model, price);
	}

}
