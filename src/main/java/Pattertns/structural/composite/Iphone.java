package Pattertns.structural.composite;

public class Iphone implements Device{
    private String name;

    public Iphone(String name) {
        this.name = name;
    }

    @Override
    public void showDisplay() {
        System.out.println("Blue display in iphone " + name);
    }
}
