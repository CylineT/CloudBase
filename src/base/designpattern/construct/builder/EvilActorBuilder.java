package base.designpattern.construct.builder;

public class EvilActorBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("��ħ");
	}

	@Override
	public void buildFace() {
		actor.setFace("����");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairStyle("����");
	}

	@Override
	public void buildSex() {
		actor.setSex("����");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("��װ");
		
	}

}
