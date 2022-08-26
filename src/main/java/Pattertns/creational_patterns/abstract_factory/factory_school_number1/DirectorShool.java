package Pattertns.creational_patterns.abstract_factory.factory_school_number1;

import Pattertns.creational_patterns.abstract_factory.person.Director;

public class DirectorShool implements Director {
    @Override
    public void consult() {
        System.out.println("Director is here");
    }
}
