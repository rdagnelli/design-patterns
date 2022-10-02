package com.robertod.behavioural.strategy;

import lombok.Data;

@Data
public class Duck {

	private String name;
	
	private IFlyStrategy flyBehaviour;
	
	public Duck(String name, IFlyStrategy flyBehaviour) {
		this.name = name;
		this.flyBehaviour = flyBehaviour;
	}
	
	public void sayHello() {
		System.out.println("Hello, I'm the duck " + name);
	}
	
	public void fly() {
		flyBehaviour.fly();
	}

}
