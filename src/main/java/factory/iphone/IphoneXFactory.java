package factory.iphone;

import model.iphone.Iphone;
import model.iphone.IphoneX;
import model.iphone.IphoneXSMax;
import factory.country.CountryRulesAbstractFactory;

public class IphoneXFactory extends IphoneFactory {

    public IphoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public Iphone createIphone(String level) {
        if (level.equals("XSMax")) {
            return new IphoneXSMax(rules);
        } else {
            return new IphoneX(rules);
        }
    }
}
