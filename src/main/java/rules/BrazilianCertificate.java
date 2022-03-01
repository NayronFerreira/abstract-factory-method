package rules;

public class BrazilianCertificate extends BrazilianPack implements Certificate{
    @Override
    public String applyCertification() {
        return "Testando todos os certificados BR!";
    }
}
