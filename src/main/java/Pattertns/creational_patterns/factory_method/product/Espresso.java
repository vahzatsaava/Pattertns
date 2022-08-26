package Pattertns.creational_patterns.factory_method.product;

public class Espresso implements Coffee{
    @Override
    public void doCoffee() {
        System.out.println("Готовим Эспрессо");
    }
}
