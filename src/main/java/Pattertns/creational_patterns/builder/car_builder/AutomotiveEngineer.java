package Pattertns.creational_patterns.builder.car_builder;

public class AutomotiveEngineer {
    private CarBuilder builder;

    public AutomotiveEngineer(CarBuilder builder) {
        this.builder = builder;
    }

    public Car manufacture(){
        return builder.fixChassis().fixBody().fixInterior().paint().build();
    }
}
