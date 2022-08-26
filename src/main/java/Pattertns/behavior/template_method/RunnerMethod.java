package Pattertns.behavior.template_method;

public class RunnerMethod {
    public static void main(String[] args) {
        TownHouse house = new TownHouse();
        house.createHouse();
        BigHouse house1 = new BigHouse();
        System.out.println("******************");
        house1.createHouse();
    }
}
