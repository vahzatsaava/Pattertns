package Pattertns.structural.decorator;

public class JeepCarDecorator extends CarDecorator{
    public JeepCarDecorator(Car car) {
        super(car);
    }
    public void moveEverywhere(){
        System.out.println("I move everyWhere");
    }
    @Override
    public void drive() {
        super.drive();
        moveEverywhere();
    }
}
