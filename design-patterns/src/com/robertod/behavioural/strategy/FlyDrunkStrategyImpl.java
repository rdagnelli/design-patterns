package com.robertod.behavioural.strategy;

public class FlyDrunkStrategyImpl implements IFlyStrategy {

	@Override
	public void fly() {
		System.out.println(">> flying drunk");
	}
}
