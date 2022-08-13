package Pattertns.creational_patterns.factory_method.factory;

import Pattertns.creational_patterns.factory_method.product.Americano;
import Pattertns.creational_patterns.factory_method.product.Coffee;

public class AmericanoShop implements CoffeeFactory{
    @Override
    public Coffee coffee() {
        return new Americano();
    }
}
