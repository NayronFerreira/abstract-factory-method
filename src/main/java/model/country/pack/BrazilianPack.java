package model.country.pack;

import factory.country.BrazilianAbstractFactory;
import service.Packing;

public class BrazilianPack extends BrazilianAbstractFactory implements Packing {
    @Override
    public String pack() {
        return "Empacotando todo o dispositivo BR!";
    }
}
