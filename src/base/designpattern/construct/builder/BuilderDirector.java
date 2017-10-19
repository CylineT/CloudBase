package base.designpattern.construct.builder;

public class BuilderDirector {

	public Actor constructActor(ActorBuilder ab) {


		ab.buildType();
		ab.buildFace();
		ab.buildHairStyle();
		ab.buildSex();
		ab.buildCostume();

		return  ab.getActor();

	}

}
