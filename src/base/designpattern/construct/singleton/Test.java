package base.designpattern.construct.singleton;

public class Test {

	public static void main(String[] args) {
		
		SingletonIODH s1,s2;
		
		s1 = SingletonIODH.getInstance();
		s2 = SingletonIODH.getInstance();
		System.out.println(s1==s2);
		
		SingletonLazy s3,s4;
		s3 = SingletonLazy.getInstance();
		s4 = SingletonLazy.getInstance();
		
		System.out.println(s3==s4);
		
	}
	
}
