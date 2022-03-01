package factory.country;

import model.country.certificate.USCertifate;
import model.country.pack.USPack;
import service.*;

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
