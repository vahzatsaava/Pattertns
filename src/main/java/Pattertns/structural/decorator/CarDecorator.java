package Pattertns.structural.decorator;

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
    }
}
