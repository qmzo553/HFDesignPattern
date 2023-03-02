package Combining.Duck;

import java.util.*;

public class Observable implements QuackObservable {
	List<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		Iterator iterator = observers.iterator();
		while(iterator.hasNext()) {
			Observer observer = (Observer) iterator.next();
			observer.update(duck);
		}
	}
	
}
