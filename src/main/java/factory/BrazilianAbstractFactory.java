package factory;

import rules.*;

public class BrazilianAbstractFactory extends CountryRulesAbstractFactory {
    @Override
    public Certificate certificate() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing packing() {
        return new BrazilianPack();
    }
}
