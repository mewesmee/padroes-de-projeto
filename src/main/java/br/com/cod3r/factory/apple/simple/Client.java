package main.java.br.com.cod3r.factory.apple.simple;

import main.java.br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import main.java.br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("### Ordering and IPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering and IPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}

}
