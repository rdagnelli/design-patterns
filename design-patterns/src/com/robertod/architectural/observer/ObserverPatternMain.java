package com.robertod.architectural.observer;

import com.robertod.BasePatternMain;
import com.robertod.Main;

public class ObserverPatternMain implements BasePatternMain {

	@Override
	public void start() {
		Main.print("====== Observer Pattern ======");
		
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver1 observer1 = new ConcreteObserver1(subject);
		ConcreteObserver2 observer2 = new ConcreteObserver2(subject);
		
		subject.setSampleData(1);
		subject.setSampleData(2);
		subject.setSampleData(3);
		
		subject.removeObserver(observer1);
		subject.setSampleData(4);
		
		subject.removeObserver(observer2);
		subject.setSampleData(5);
		
		subject.registerObserver(observer2);
		subject.setSampleData(6);

		subject.registerObserver(observer1);
		subject.setSampleData(7);
	}

}
