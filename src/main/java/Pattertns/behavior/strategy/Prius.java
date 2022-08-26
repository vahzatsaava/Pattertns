package Pattertns.behavior.strategy;

public class Prius extends Auto {

    public Prius() {
        super(new HibrydCar());
    }

    @Override
    public void fillAuto() {
        super.fillAuto();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
