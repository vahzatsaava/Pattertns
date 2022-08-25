package Pattertns.creational_patterns.builder.car_builder;

public class ClassicCarBuilder implements CarBuilder{
    private String chassis;
    private String body;
    private String paint;
    private String interior;

    @Override
    public CarBuilder fixChassis() {
        System.out.println("Assembling chassis of the classical model");
        this.chassis = "Classic Chasis";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("Assembling body of the classical model");
        this.body = "Classic Body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Painting body of the classical model");
        this.paint = "Classic White Paint";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("Setting up interior of the classical model");
        this.interior = "Classic interior";
        return this;
    }

    @Override
    public Car build() {
        return new Car(chassis,body,paint,interior);
    }
}
