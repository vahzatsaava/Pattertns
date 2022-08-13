package Pattertns.creational_patterns.factory_method.product;

public class Latte implements Coffee{
    @Override
    public void doCoffee() {
        System.out.println("Готовим Латте!");
    }
}
