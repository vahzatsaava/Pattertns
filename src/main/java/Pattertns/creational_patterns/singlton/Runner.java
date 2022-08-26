package Pattertns.creational_patterns.singlton;

public class Runner {
    public static void main(String[] args) {
        SingletonDemo.getSingletonDemo().add("first");
        SingletonDemo.getSingletonDemo().add("second");
        SingletonDemo.getSingletonDemo().add("third");
        SingletonDemo.getSingletonDemo().showInfo();

        SingletonDemo.getSingletonDemo().add("Hundert");
        SingletonDemo.getSingletonDemo().showInfo();

    }
}
