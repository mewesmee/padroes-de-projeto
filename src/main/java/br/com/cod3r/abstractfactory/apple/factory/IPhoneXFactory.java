package main.java.br.com.cod3r.abstractfactory.apple.factory;

import main.java.br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import main.java.br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import main.java.br.com.cod3r.abstractfactory.apple.model.iphone.IPhoneX;
import main.java.br.com.cod3r.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{ 

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}
	
	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}
}
