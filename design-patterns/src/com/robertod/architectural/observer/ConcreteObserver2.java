package com.robertod.architectural.observer;

import com.robertod.Main;

public class ConcreteObserver2 implements IObserver, IDisplay {
	
	private ConcreteSubject concreteSubject;
	
	private Integer sampleData;
	
	public ConcreteObserver2(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
		this.concreteSubject.registerObserver(this);
	}

	@Override
	public void update() {
		sampleData = concreteSubject.getSampleData();
		Main.print("ConcreteObserver2 updated.");
		display();
	}
	
	public Integer getSampleData() {
		return sampleData;
	}

	public void setSampleData(Integer sampleData) {
		this.sampleData = sampleData;
	}

	@Override
	public void display() {
		Main.print("ConcreteObserver2 sampleData = " + sampleData);		
	}
	
}
