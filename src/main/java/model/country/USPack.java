package model.country;

import factory.country.USAbstractFactory;
import service.Packing;

public class USPack extends USAbstractFactory implements Packing {
    @Override
    public String pack() {
        return "Packing the device!";
    }
}
