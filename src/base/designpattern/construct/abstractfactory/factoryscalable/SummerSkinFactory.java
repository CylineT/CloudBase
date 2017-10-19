package base.designpattern.construct.abstractfactory.factoryscalable;

import base.designpattern.construct.abstractfactory.productseries.Button;
import base.designpattern.construct.abstractfactory.productseries.CheckBox;
import base.designpattern.construct.abstractfactory.productseries.Frame;
import base.designpattern.construct.abstractfactory.productseries.SummerButton;
import base.designpattern.construct.abstractfactory.productseries.SummerCheckBox;
import base.designpattern.construct.abstractfactory.productseries.SummerFrame;

public class SummerSkinFactory implements SkinFactory{

	@Override
	public Button buildButtonSkin() {
		return new SummerButton();
	}

	@Override
	public CheckBox buildCheckBoxSkin() {
		return new SummerCheckBox();
	}

	@Override
	public Frame buildFrameSkin() {
		return new SummerFrame();
	}

}
