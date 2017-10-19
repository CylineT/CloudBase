package base.designpattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	protected List<Observer> observerList = new ArrayList<Observer>();
	
	public void setObserver(Observer ob) {
		observerList.add(ob);
	}
	
	public void removeOberver(Observer ob) {
		observerList.remove(ob);
	}
	
	public abstract void toNotify();
	
}
