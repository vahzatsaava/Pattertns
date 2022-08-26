package Pattertns.creational_patterns.singlton;

public class SingletonDemo {
    private static SingletonDemo singletonDemo;
    private static String logFile = "This is logFile \n";

    private SingletonDemo() {

    }

    public static synchronized SingletonDemo getSingletonDemo() {
        if (singletonDemo == null) {
            singletonDemo = new SingletonDemo();
        }
        return singletonDemo;
    }

    public void add(String info) {
        logFile += info + "\n";
    }

    public void showInfo() {
        System.out.println(logFile);
    }
}
