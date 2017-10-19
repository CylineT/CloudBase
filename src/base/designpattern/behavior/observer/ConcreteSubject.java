package base.designpattern.behavior.observer;


public class ConcreteSubject extends Subject {

	@Override
	public void toNotify() {
		
		System.out.println("specific method was invoked, informing Observers...");
		
		// Iterator<Observer> iterator = observerList.iterator();
		// while(iterator.hasNext()) {
		// iterator.next().update();
		// }
		for (Observer ob : observerList) {
			ob.update();
		}
	}

}
