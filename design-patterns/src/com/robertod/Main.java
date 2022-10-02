package com.robertod;

import java.util.Arrays;
import java.util.List;

import com.robertod.architectural.observer.ObserverPatternMain;
import com.robertod.behavioural.strategy.StrategyPatternMain;
import com.robertod.creational.factory.abstractfactory.AbstractFactoryPatternMain;
import com.robertod.creational.factory.factorymethod.FactoryMethodPatternMain;
import com.robertod.creational.factory.simplefactory.SimpleFactoryPatternMain;
import com.robertod.creational.singleton.SingletonPatternMain;
import com.robertod.structural.decorator.DecoratorPatternMain;

public class Main {
	
	public static void main(String[] args) {
		Utils.print("STARTED");
		
		List<BasePatternMain> patterns = Arrays.asList(
				new StrategyPatternMain(),
				new ObserverPatternMain(),
				new DecoratorPatternMain(),
				new SimpleFactoryPatternMain(),
				new FactoryMethodPatternMain(),
				new AbstractFactoryPatternMain(),
				new SingletonPatternMain()
		);
		
		patterns.forEach(BasePatternMain::start);
	}
	
}
