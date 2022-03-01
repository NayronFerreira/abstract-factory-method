package rules;

import factory.BrazilianAbstractFactory;

public class BrazilianPack extends BrazilianAbstractFactory implements Packing{
    @Override
    public String pack() {
        return "Empacotando todo o dispositivo BR!";
    }
}
