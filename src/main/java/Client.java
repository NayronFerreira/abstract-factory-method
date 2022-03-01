import factory.BrazilianAbstractFactory;
import factory.Iphone11Factory;
import factory.IphoneFactory;

import factory.USAbstractFactory;
import model.Iphone;



public class Client {

    public static void main(String[] args) {
        IphoneFactory device = new Iphone11Factory(new USAbstractFactory());
        Iphone iphonePro = device.orderIphone("11");
        System.out.println(iphonePro);
    }
}
