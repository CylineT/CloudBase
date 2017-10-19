package base.designpattern.construct.builder;

public class KindActorBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("天使");
	}

	@Override
	public void buildFace() {
		actor.setFace("和善");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairStyle("整洁");
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("白装");
	}

}
