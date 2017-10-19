package base.designpattern.construct.builder;

public class EvilActorBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("¶ñÄ§");
	}

	@Override
	public void buildFace() {
		actor.setFace("Ð×Á³");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairStyle("ÅîÂÒ");
	}

	@Override
	public void buildSex() {
		actor.setSex("²»Ã÷");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("ºÚ×°");
		
	}

}
