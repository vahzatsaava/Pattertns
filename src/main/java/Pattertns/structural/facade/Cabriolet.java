package Pattertns.structural.facade;

public class Cabriolet implements Car{
    @Override
    public void start() {
        System.out.println("Cabriolet is started");
    }

    @Override
    public void move() {
        System.out.println("Cabriolet is moving");
    }
}
