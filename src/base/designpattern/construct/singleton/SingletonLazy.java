package base.designpattern.construct.singleton;

/**
 * ������ģʽ+double check 
 * @author Cyline
 *
 */
public class SingletonLazy {

	private volatile static SingletonLazy singletonInstance;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (singletonInstance == null) {
			synchronized (SingletonLazy.class) {
				if (singletonInstance == null) {
					singletonInstance = new SingletonLazy();
				}
			}
		}
		return singletonInstance;
	}
}
