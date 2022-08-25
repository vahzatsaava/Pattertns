package Pattertns.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Car car = new SportCarDecorator(new SportCar());
        car.drive();
        Car car1 = new JeepCarDecorator(new JeepCar());
        car1.drive();
    }
}
