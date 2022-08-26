package Pattertns.structural.facade;

public class FacadeCars {
    private final Cabriolet cabriolet = new Cabriolet();
    private final RetroCars retroCars = new RetroCars();

    public void start(){
        cabriolet.start();
        retroCars.start();
    }

    public void move(){
        cabriolet.move();
        retroCars.move();
    }
}
