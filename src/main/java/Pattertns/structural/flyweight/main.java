package Pattertns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        CarsFactory factory = new CarsFactory();
        List<Car> cars = new ArrayList<>();
        cars.add(factory.getCarByName("jeep"));
        cars.add(factory.getCarByName("jeep"));
        cars.add(factory.getCarByName("jeep"));
        cars.add(factory.getCarByName("picap"));
        cars.add(factory.getCarByName("picap"));

        for (Car car:cars) {
            car.drive();
        }
    }
}
