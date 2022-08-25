package Pattertns.structural.decorator;

public class SportCar implements Car{
    @Override
    public void drive() {
        System.out.println("Sport cars speed is more than 200 km");
    }
}
