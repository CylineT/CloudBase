package base.designpattern.construct.builder;


public class AnimalActorBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("兽人");
	}

	@Override
	public void buildFace() {
		actor.setFace("不明");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairStyle("全身");
	}

	@Override
	public void buildSex() {
		actor.setSex("不明");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("无装");
	}
	
	

}
