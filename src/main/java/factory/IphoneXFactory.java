package factory;

import model.Iphone;
import model.IphoneX;
import model.IphoneXSMax;
import rules.CountryRulesAbstractFactory;

public class IphoneXFactory extends IphoneFactory{

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
