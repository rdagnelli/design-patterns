package com.robertod.creational.factory.abstractfactory;

public interface TechAbstractFactory {

	public Laptop createLaptop(String model, Double price);
	
	public Smartphone createSmartphone(String model, Double price);
	
}
