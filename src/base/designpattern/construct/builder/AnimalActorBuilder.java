package base.designpattern.construct.builder;


public class AnimalActorBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("����");
	}

	@Override
	public void buildFace() {
		actor.setFace("����");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairStyle("ȫ��");
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
