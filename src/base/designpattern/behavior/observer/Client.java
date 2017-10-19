package base.designpattern.behavior.observer;

public class Client {

	public static void main(String[] args) {
		
		Observer observer1 = new ConcreteObserver("observer1");
		Observer observer2 = new ConcreteObserver("observer2");
		Observer observer3 = new ConcreteObserver("observer3");
		
		Subject subject = new ConcreteSubject();
		
		subject.setObserver(observer1);
		subject.setObserver(observer2);
		subject.setObserver(observer3);
		
		subject.toNotify();
		
		
	}
	
}
