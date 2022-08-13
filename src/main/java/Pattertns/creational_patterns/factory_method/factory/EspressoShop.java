package Pattertns.creational_patterns.factory_method.factory;

import Pattertns.creational_patterns.factory_method.product.Coffee;
import Pattertns.creational_patterns.factory_method.product.Espresso;

public class EspressoShop implements CoffeeFactory{
    @Override
    public Coffee coffee() {
        return new Espresso();
    }
}
