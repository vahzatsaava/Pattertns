package Pattertns.creational_patterns.builder.car_builder;

public interface CarBuilder {
    CarBuilder fixChassis();
    CarBuilder fixBody();
    CarBuilder paint();
    CarBuilder fixInterior();

    public Car build();

}
