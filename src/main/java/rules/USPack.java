package rules;

import factory.USAbstractFactory;

public class USPack extends USAbstractFactory implements Packing {
    @Override
    public String pack() {
        return "Packing the device!";
    }
}
