package main.java.br.com.cod3r.abstractfactory.apple.factory.abstractFactory;

import main.java.br.com.cod3r.abstractfactory.apple.model.certificate.Certificate;
import main.java.br.com.cod3r.abstractfactory.apple.model.certificate.USCertificate;
import main.java.br.com.cod3r.abstractfactory.apple.model.packing.Packing;
import main.java.br.com.cod3r.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}
	
	public Packing getPacking() {
		return new USPacking();
	}
}
