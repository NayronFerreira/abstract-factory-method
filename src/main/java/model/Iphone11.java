package model;

import rules.CountryRulesAbstractFactory;

public class Iphone11 extends Iphone {
    public Iphone11(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Lista de Hardware");
        System.out.println("\t- 1 console Slim");
        System.out.println("\t- 2 controllers wirelles");
        System.out.println("\t- 100Gb memory");
        System.out.println("\t- 4Gb RAM");
    }
}
