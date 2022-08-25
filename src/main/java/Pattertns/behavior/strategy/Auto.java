package Pattertns.behavior.strategy;

public class Auto implements BehaviorAuto{
    private FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }
    public void fillAuto(){
        fillStrategy.fill();
    }

    @Override
    public void drive() {
        System.out.println("The car is moving");
    }

    @Override
    public void stop() {
        System.out.println("the car is stopped");
    }
}
