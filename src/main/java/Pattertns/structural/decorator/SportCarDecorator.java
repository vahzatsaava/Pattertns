package Pattertns.structural.decorator;

public class SportCarDecorator extends CarDecorator {
    public SportCarDecorator(Car car) {
        super(car);
    }

    public String setColorBlue() {
        return " Color blue";
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(setColorBlue());
    }

}
