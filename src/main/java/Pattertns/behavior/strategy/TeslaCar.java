package Pattertns.behavior.strategy;

public class TeslaCar extends Auto {
    public TeslaCar() {
        super(new Electro());
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
