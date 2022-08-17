package com.robertod.behavioural.strategy;

import com.robertod.BasePatternMain;
import com.robertod.Main;

public class StrategyPatternMain implements BasePatternMain{

	@Override
	public void start() {
		Main.print("====== Strategy Pattern ======");
		
		Duck john = new Duck("John the Normal duck", new FlyStrategyImpl());
		Duck erick = new Duck("Erick the Drunk duck", new FlyDrunkStrategyImpl());
		
		john.sayHello();
		john.fly();
		
		erick.sayHello();
		erick.fly();
	}
	
	
}
