package com.robertod.behavioural.strategy;

public class FlyStrategyImpl implements IFlyStrategy {

	@Override
	public void fly() {
		System.out.println(">> flying");
	}
}
