package Pattertns.creational_patterns.factory_method.client;

import Pattertns.creational_patterns.factory_method.factory.AmericanoShop;
import Pattertns.creational_patterns.factory_method.factory.CoffeeFactory;
import Pattertns.creational_patterns.factory_method.factory.EspressoShop;
import Pattertns.creational_patterns.factory_method.factory.LatteShop;

public class CoffeeMain {
    public static void main(String[] args) {
        CoffeeFactory factory = factory("amer");
        factory.coffee().doCoffee();
    }
    static CoffeeFactory factory(String coffee){
        if (coffee.equalsIgnoreCase("latte")){
            return new LatteShop();
        }else if (coffee.equalsIgnoreCase("amer")){
            return new AmericanoShop();
        }else if (coffee.equalsIgnoreCase("esp")){
            return new EspressoShop();
        }else {
            throw new RuntimeException(coffee + " Unknown coffee");
        }
    }
}
