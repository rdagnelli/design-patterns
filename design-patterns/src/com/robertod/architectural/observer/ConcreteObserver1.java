package com.robertod.architectural.observer;

import com.robertod.Utils;

public class ConcreteObserver1 implements IObserver, IDisplay {

	private ConcreteSubject concreteSubject;
	
	private Integer sampleData;
	
	public ConcreteObserver1(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
		this.concreteSubject.registerObserver(this);
	}
	
	@Override
	public void update() {
		sampleData = concreteSubject.getSampleData();
		Utils.print("ConcreteObserver1 updated.");
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
		Utils.print("ConcreteObserver1 sampleData = " + sampleData);		
	}
	
}
