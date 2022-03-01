package factory.country;

import model.country.certificate.BrazilianCertificate;
import model.country.pack.BrazilianPack;
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
