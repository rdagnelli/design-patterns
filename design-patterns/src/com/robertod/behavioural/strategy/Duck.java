package com.robertod.behavioural.strategy;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Duck {

	private String name;
	
	private IFlyStrategy flyBehaviour;
	
	public Duck(String name, IFlyStrategy flyBehaviour) {
		this.name = name;
		this.flyBehaviour = flyBehaviour;
	}
	
	public void sayHello() {
		System.out.println("Hello, i'm the duck " + name);
	}
	
	public void fly() {
		flyBehaviour.fly();
	}

}
