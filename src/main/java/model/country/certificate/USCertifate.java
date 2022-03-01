package model.country.certificate;

import factory.country.USAbstractFactory;
import service.Certificate;

public class USCertifate extends USAbstractFactory implements Certificate {
    @Override
    public String applyCertification() {
        return "Testing all certificates!";
    }
}
