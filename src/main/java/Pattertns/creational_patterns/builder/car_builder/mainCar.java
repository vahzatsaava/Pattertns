package Pattertns.creational_patterns.builder.car_builder;

public class mainCar {
    public static void main(String[] args) {
        CarBuilder builder = new ClassicCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufacture();
        System.out.println(car);
    }
}
