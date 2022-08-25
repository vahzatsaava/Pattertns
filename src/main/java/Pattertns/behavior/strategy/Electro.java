package Pattertns.behavior.strategy;

public class Electro implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Not use the filling oil");
    }
}
