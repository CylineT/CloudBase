package base.designpattern.construct.builder;

public class KindActorBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("��ʹ");
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
		actor.setSex("��");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("��װ");
	}

}
