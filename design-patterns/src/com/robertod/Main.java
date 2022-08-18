package com.robertod;

import com.robertod.architectural.observer.ObserverPatternMain;
import com.robertod.behavioural.strategy.StrategyPatternMain;
import com.robertod.structural.decorator.DecoratorPatternMain;

public class Main {
	
	public static void main(String[] args) {
		print("STARTED");
		
		StrategyPatternMain strategyPatternMain = new StrategyPatternMain();
		strategyPatternMain.start();
		
		ObserverPatternMain observerPatternMain = new ObserverPatternMain();
		observerPatternMain.start();
		
		DecoratorPatternMain decoratorPatternMain = new DecoratorPatternMain();
		decoratorPatternMain.start();
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}
