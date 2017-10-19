package base.designpattern.construct.builder;

/**
 * 被建造的复杂对象
 * @author Cyline
 *
 */
public class Actor {

	private String type;
	private String face;
	private String costume;
	private String hairStyle;
	private String sex;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getCostume() {
		return costume;
	}
	public void setCostume(String costume) {
		this.costume = costume;
	}
	public String getHairStyle() {
		return hairStyle;
	}
	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Actor [type=" + type + ", face=" + face + ", costume=" + costume + ", hairStyle=" + hairStyle + ", sex="
				+ sex + "]";
	}
	
	
	
}
