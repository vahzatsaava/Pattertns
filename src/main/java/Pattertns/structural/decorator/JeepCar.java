package Pattertns.structural.decorator;

public class JeepCar implements Car{
    @Override
    public void drive() {
        System.out.println("Jeep has weight > 2000 ");
    }
}
