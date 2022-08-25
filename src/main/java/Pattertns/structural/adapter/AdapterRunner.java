package Pattertns.structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        SystemO systemO = new AdapterSystemToApp();
        systemO.pause();
        systemO.stop();
        systemO.start();
    }
}
