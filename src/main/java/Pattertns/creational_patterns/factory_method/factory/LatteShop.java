package Pattertns.creational_patterns.factory_method.factory;

import Pattertns.creational_patterns.factory_method.product.Coffee;
import Pattertns.creational_patterns.factory_method.product.Latte;

public class LatteShop implements CoffeeFactory{
    @Override
    public Coffee coffee() {
        return new Latte();
    }
}
