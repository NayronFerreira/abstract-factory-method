package factory;

import model.Iphone;
import model.Iphone11;
import model.Iphone11Pro;
import rules.CountryRulesAbstractFactory;

public class Iphone11Factory extends IphoneFactory {
    public Iphone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public Iphone createIphone(String level) {
        if (level.equals("11")) {
            return new Iphone11(rules);
        } else {
            return new Iphone11Pro(rules);
        }
    }
}
