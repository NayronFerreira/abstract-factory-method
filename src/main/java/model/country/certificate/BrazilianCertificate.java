package model.country.certificate;

import model.country.pack.BrazilianPack;
import service.Certificate;

public class BrazilianCertificate extends BrazilianPack implements Certificate {
    @Override
    public String applyCertification() {
        return "Testando todos os certificados BR!";
    }
}
