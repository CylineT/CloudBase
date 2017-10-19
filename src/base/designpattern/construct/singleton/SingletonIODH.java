package base.designpattern.construct.singleton;


/**
 * ��ʵ���������أ��ֲ������߳�����������ѡ�
 * @author Cyline
 * ��ʼ������������
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
