package main.java.br.com.cod3r.abstractfactory.apple;

import main.java.br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import main.java.br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import main.java.br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import main.java.br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import main.java.br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import main.java.br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an IPhone X");
		IPhone iphone = genXFactory.orderIphone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an IPhone 11 highEnd");
		IPhone iphone2 = gen11Factory.orderIphone("highEnd");
		System.out.println(iphone2);
	}
}
