package Pattertns.structural.composite;

public class CompositeRunner {
    public static void main(String[] args) {
        DevisesSaver saver = new DevisesSaver();
        saver.addDevice(new Samsung("3310"));
        saver.addDevice(new Iphone("7s"));
        saver.addDevice(new Samsung("3300"));
        saver.create();
    }
}
