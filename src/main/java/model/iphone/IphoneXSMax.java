package model.iphone;

import factory.country.CountryRulesAbstractFactory;

public class IphoneXSMax extends Iphone {
    public IphoneXSMax(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Lista de Hardware");
        System.out.println("\t- 1 console");
        System.out.println("\t- 2 controllers wirelles");
        System.out.println("\t- 10Gb memory");
        System.out.println("\t- 2Gb RAM");
    }
}
