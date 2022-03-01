import factory.country.BrazilianAbstractFactory;
import factory.iphone.Iphone11Factory;
import factory.iphone.IphoneFactory;

import factory.country.USAbstractFactory;
import model.iphone.Iphone;



public class Client {

    public static void main(String[] args) {
        IphoneFactory device = new Iphone11Factory(new BrazilianAbstractFactory());
        Iphone iphonePro = device.orderIphone("11");
        System.out.println(iphonePro);
    }
}
