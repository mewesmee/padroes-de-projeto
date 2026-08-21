package main.java.br.com.cod3r.abstractfactory.apple.factory.abstractFactory;

import main.java.br.com.cod3r.abstractfactory.apple.model.certificate.BrazilianCertificate;
import main.java.br.com.cod3r.abstractfactory.apple.model.certificate.Certificate;
import main.java.br.com.cod3r.abstractfactory.apple.model.packing.BrazilianPacking;
import main.java.br.com.cod3r.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}
	
	public Packing getPacking() {
		return new BrazilianPacking();
	}
}
