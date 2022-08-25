package Pattertns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarsFactory {
    private static Map<String, Car> map = new HashMap<>();

    public Car getCarByName(String name) {
        Car car = map.get(name);
        if (car == null) {
            switch (name) {
                case "jeep":
                    System.out.println("Create jeep");
                    car = new Jeep();
                    break;
                case "picap":
                    System.out.println("Create picap");
                    car = new Picap();
                    break;
            }
            map.put(name, car);
        }
        return car;
    }
}
