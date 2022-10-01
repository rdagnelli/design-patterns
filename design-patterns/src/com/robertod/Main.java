package com.robertod;

import com.robertod.architectural.observer.ObserverPatternMain;
import com.robertod.behavioural.strategy.StrategyPatternMain;
import com.robertod.creational.factory.abstractfactory.AbstractFactoryPatternMain;
import com.robertod.creational.factory.factorymethod.FactoryMethodPatternMain;
import com.robertod.creational.factory.simplefactory.SimpleFactoryPatternMain;
import com.robertod.structural.decorator.DecoratorPatternMain;

public class Main {
	
	public static void main(String[] args) {
		Utils.print("STARTED");
		
		StrategyPatternMain strategyPatternMain = new StrategyPatternMain();
		strategyPatternMain.start();
		
		ObserverPatternMain observerPatternMain = new ObserverPatternMain();
		observerPatternMain.start();
		
		DecoratorPatternMain decoratorPatternMain = new DecoratorPatternMain();
		decoratorPatternMain.start();
		
		SimpleFactoryPatternMain simpleFactoryPatternMain = new SimpleFactoryPatternMain();
		simpleFactoryPatternMain.start();
		
		FactoryMethodPatternMain factoryMethodPatternMain = new FactoryMethodPatternMain();
		factoryMethodPatternMain.start();
		
		AbstractFactoryPatternMain abstractFactoryPatternMain = new AbstractFactoryPatternMain();
		abstractFactoryPatternMain.start();
		
	}
}
