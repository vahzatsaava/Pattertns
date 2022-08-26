package Pattertns.structural.bridge;

public class CarsSeller implements Seller{
    @Override
    public void sell() {
        System.out.println("Seller sell auto");
    }
}
