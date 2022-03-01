package factory.country;

import service.Certificate;
import service.Packing;

public abstract class CountryRulesAbstractFactory {

    public abstract Certificate certificate();

    public abstract Packing packing();
}
