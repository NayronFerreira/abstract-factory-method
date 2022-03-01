package model;

import rules.CountryRulesAbstractFactory;

public abstract class Iphone {

    CountryRulesAbstractFactory rules;

    public Iphone(CountryRulesAbstractFactory rules){
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Montar todo o hardware");
    }

    public void certificates() {
        System.out.println("Verificando país que realizará a certificação");
        System.out.println(rules.certificate().applyCertification());
    }

    public void pack() {
        System.out.println("Verificando país que realizará empacotando do dispositivo");
        System.out.println(rules.packing().pack());
    }
}
