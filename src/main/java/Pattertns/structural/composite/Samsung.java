package Pattertns.structural.composite;

public class Samsung implements Device{
    private String name;

    public Samsung(String name) {
        this.name = name;
    }

    @Override
    public void showDisplay() {
        System.out.println("Kristal display in samsung " + name);
    }
}
