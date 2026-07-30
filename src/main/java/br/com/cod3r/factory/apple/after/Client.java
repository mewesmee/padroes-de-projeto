package main.java.br.com.cod3r.factory.apple.after;

import main.java.br.com.cod3r.factory.apple.after.factory.IPhone11ProFactory;
import main.java.br.com.cod3r.factory.apple.after.factory.IPhoneFactory;
import main.java.br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;
import main.java.br.com.cod3r.factory.apple.after.model.IPhone;

public class Client {

	public static void main(String[] args) {
	
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering and IPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an IPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}

}
