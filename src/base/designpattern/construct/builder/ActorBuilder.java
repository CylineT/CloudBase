package base.designpattern.construct.builder;

public abstract class ActorBuilder {
	
	protected Actor actor = new Actor();
	/**
	 * private String type;
	private String face;
	private String costume;
	private String hairStyle;
	private String sex;
	 */
	
	public abstract void buildType();
	public abstract void buildFace();
	public abstract void buildHairStyle();
	public abstract void buildSex();
	public abstract void buildCostume();
	
	

	public Actor getActor() {
		return actor;
	}
	
}
