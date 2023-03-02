package Combining.Duck;

public class Duckcall implements Quackable {
	Observable observable;

	public Duckcall() {
		observable = new Observable(this);
	}
	
	public void quack() {
		System.out.println("꽉꽉");
		notifyObservers();
	}
	
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}
