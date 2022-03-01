package factory;

import rules.*;

public class USAbstractFactory extends CountryRulesAbstractFactory {
    @Override
    public Certificate certificate() {
        return new USCertifate();
    }

    @Override
    public Packing packing() {
        return new USPack();
    }
}
