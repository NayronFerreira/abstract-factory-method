package model.iphone;

import factory.country.CountryRulesAbstractFactory;

public class Iphone11Pro extends Iphone {
    public Iphone11Pro(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Lista de Hardware");
        System.out.println("\t- 1 console Slim");
        System.out.println("\t- 2 controllers wirelles");
        System.out.println("\t- 1Tb memory");
        System.out.println("\t- 10Gb RAM");
    }
}
