package com.robertod.architectural.observer;

import java.util.ArrayList;
import java.util.List;

import com.robertod.Utils;

public class ConcreteSubject implements ISubject {

	private List<IObserver> observerList;
	
	private Integer sampleData;
	
	public ConcreteSubject() {
		observerList = new ArrayList<>();
		setSampleData(0);
	}
	
	@Override
	public void registerObserver(IObserver observer) {
		Utils.print("Registering new observer");
		observerList.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		Utils.print("Removing observer");
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer : observerList) {
			observer.update();
		}
	}

	public Integer getSampleData() {
		return sampleData;
	}

	public void setSampleData(Integer sampleData) {
		this.sampleData = sampleData;
		notifyObservers();
	}
	
}
