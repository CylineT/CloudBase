package base.designpattern.construct.singleton;


/**
 * 既实现了懒加载，又不存在线程锁，性能最佳。
 * @author Cyline
 * 初始化需求容器。
 */
public class SingletonIODH {
	
	private SingletonIODH() {
	}

	public static SingletonIODH getInstance() {
		return Container.instance;
	}

	private static class Container {
		private static final SingletonIODH instance = new SingletonIODH();
	}

}
