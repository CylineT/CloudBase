package base.designpattern.construct.builder;

public class Test {

	public static void main(String[] args) {
		EvilActorBuilder builder = new EvilActorBuilder();
		BuilderDirector director = new BuilderDirector();
		Actor constructActor = director.constructActor(builder);
		System.out.println(constructActor);
	}

}
