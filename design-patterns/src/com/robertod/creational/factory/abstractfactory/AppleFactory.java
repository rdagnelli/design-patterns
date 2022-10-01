package com.robertod.creational.factory.abstractfactory;

public class AppleFactory implements TechAbstractFactory{

	@Override
	public Laptop createLaptop(String model, Double price) {
		return new AppleLaptop(model, price);
	}

	@Override
	public Smartphone createSmartphone(String model, Double price) {
		return new AppleSmartphone(model, price);
	}

}
