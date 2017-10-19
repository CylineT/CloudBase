package base.designpattern.construct.abstractfactory.factoryscalable;

import base.designpattern.construct.abstractfactory.productseries.Button;
import base.designpattern.construct.abstractfactory.productseries.CheckBox;
import base.designpattern.construct.abstractfactory.productseries.Frame;

public interface SkinFactory {

	public Button buildButtonSkin();
	public CheckBox buildCheckBoxSkin();
	public Frame buildFrameSkin();
	
}
