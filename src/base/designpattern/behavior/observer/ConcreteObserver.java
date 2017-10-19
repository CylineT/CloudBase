package base.designpattern.behavior.observer;

public class ConcreteObserver implements Observer {

	String name;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update() {

		System.out.println(name+" Observer was informed");

	}

}
