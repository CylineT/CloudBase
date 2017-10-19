package base.designpattern.construct.abstractfactory;

import base.designpattern.construct.abstractfactory.factoryscalable.SkinFactory;
import base.designpattern.construct.abstractfactory.factoryscalable.SpringSkinFactory;

public class Client {

	public static void main(String[] args) {
		SkinFactory sf = new SpringSkinFactory();
		sf.buildButtonSkin().display();
		sf.buildCheckBoxSkin().display();
		sf.buildFrameSkin().display();
	}
}
