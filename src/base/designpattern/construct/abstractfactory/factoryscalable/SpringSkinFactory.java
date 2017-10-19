package base.designpattern.construct.abstractfactory.factoryscalable;

import base.designpattern.construct.abstractfactory.productseries.Button;
import base.designpattern.construct.abstractfactory.productseries.CheckBox;
import base.designpattern.construct.abstractfactory.productseries.Frame;
import base.designpattern.construct.abstractfactory.productseries.SpringButton;
import base.designpattern.construct.abstractfactory.productseries.SpringCheckBox;
import base.designpattern.construct.abstractfactory.productseries.SpringFrame;

public class SpringSkinFactory implements SkinFactory{

	@Override
	public Button buildButtonSkin() {
		return new SpringButton();
	}

	@Override
	public CheckBox buildCheckBoxSkin() {
		return new SpringCheckBox();
	}

	@Override
	public Frame buildFrameSkin() {
		return new SpringFrame();
	}

}
