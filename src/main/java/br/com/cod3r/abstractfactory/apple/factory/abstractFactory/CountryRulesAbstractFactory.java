package main.java.br.com.cod3r.abstractfactory.apple.factory.abstractFactory;

import main.java.br.com.cod3r.abstractfactory.apple.model.certificate.Certificate;
import main.java.br.com.cod3r.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
