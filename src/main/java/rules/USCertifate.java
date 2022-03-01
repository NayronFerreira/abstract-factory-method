package rules;

import factory.USAbstractFactory;

public class USCertifate extends USAbstractFactory implements Certificate {
    @Override
    public String applyCertification() {
        return "Testing all certificates!";
    }
}
