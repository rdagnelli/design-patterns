package com.robertod.creational.factory.abstractfactory;

import com.robertod.BasePatternMain;
import com.robertod.Utils;

public class AbstractFactoryPatternMain implements BasePatternMain {

	@Override
	public void start() {
		Utils.print("====== Abstract Factory Pattern ======");
		try {
			
			// Samsung Factory
			TechAbstractFactory factory = new SamsungFactory();
			
			Laptop laptop = factory.createLaptop("Galaxy Book Pro 2022", Double.valueOf(899));
			Smartphone smartphone = factory.createSmartphone("Samsung Galaxy S22", Double.valueOf(679));
			
			laptop.printLaptopDetails();
			smartphone.printSmartphoneDetails();
			
			
			// Apple Factory
			factory = new AppleFactory();
			
			laptop = factory.createLaptop("Macbook Pro 2022", Double.valueOf(1659));
			smartphone = factory.createSmartphone("Iphone 14", Double.valueOf(1029));
			
			laptop.printLaptopDetails();
			smartphone.printSmartphoneDetails();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}
