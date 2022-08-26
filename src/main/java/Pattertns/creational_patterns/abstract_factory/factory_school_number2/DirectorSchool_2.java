package Pattertns.creational_patterns.abstract_factory.factory_school_number2;

import Pattertns.creational_patterns.abstract_factory.person.Director;

public class DirectorSchool_2 implements Director {
    @Override
    public void consult() {
        System.out.println("Director from 2");
    }
}
