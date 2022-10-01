package com.robertod.creational.factory.abstractfactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Laptop {

	protected String brand;
	
	protected String model; 
	
	protected Double price;
	
	public abstract void printLaptopDetails();
		
}
