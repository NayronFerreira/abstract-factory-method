package factory.iphone;

import model.iphone.Iphone;
import model.iphone.Iphone11;
import model.iphone.Iphone11Pro;
import factory.country.CountryRulesAbstractFactory;

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
