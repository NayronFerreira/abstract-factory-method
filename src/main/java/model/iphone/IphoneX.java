package model.iphone;

import factory.country.CountryRulesAbstractFactory;

public class IphoneX extends Iphone {
    public IphoneX(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Lista de Hardware");
        System.out.println("\t- 1 console");
        System.out.println("\t- 2 controllers");
        System.out.println("\t- 1 memory card");
        System.out.println("\t- 1Gb RAM");
    }
}
