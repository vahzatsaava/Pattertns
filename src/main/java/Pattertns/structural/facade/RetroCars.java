package Pattertns.structural.facade;

public class RetroCars implements Car{

    @Override
    public void start() {
        System.out.println("Retro is started");
    }

    @Override
    public void move() {
        System.out.println("Retro is moving");
    }
}
