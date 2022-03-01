package factory.country;

import model.country.USCertifate;
import model.country.USPack;
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
