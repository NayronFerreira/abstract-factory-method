package factory.iphone;

import model.iphone.Iphone;
import factory.country.CountryRulesAbstractFactory;

public abstract class IphoneFactory {

    CountryRulesAbstractFactory rules;

    public IphoneFactory(CountryRulesAbstractFactory rules){
        this.rules = rules;
    }

    public Iphone orderIphone(String level) {
        Iphone device = null;
        device = createIphone(level);

        device.assemble();
        device.certificates();
        device.getHardware();
        device.pack();
        return device;
    }

    public abstract Iphone createIphone(String level);
}
