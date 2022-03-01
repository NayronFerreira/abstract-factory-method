package factory.country;

import model.country.BrazilianCertificate;
import model.country.BrazilianPack;
import service.*;

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
