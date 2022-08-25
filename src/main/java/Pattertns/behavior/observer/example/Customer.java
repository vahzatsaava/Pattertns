package Pattertns.behavior.observer.example;

import java.util.List;

public class Customer implements News{
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void event(List<String> news) {
        System.out.println(name + " we have news for you " + news);
    }
}
