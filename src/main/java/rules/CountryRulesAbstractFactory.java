package rules;

import factory.IphoneFactory;

public abstract class CountryRulesAbstractFactory {

    public abstract Certificate certificate();

    public abstract Packing packing();
}
