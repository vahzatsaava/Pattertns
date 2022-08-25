package Pattertns.creational_patterns.abstract_factory.person;

import Pattertns.creational_patterns.abstract_factory.factory_school_number1.SchoolNumber1;
import Pattertns.creational_patterns.abstract_factory.factory_school_number2.SchoolNumber2;

public class Main {
    public static void main(String[] args) {
        PersonalFactory personalFactory = new SchoolNumber1();
        Director director = personalFactory.getDirector();
        Teacher teacher = personalFactory.getTeacher();
        Schoolboy schoolboy = personalFactory.getSchoolboy();

        System.out.println("Creating school");
        director.consult();
        teacher.teach();
        schoolboy.study();

        PersonalFactory factory = new SchoolNumber2();
        Director director1 = factory.getDirector();
        Teacher teacher1 = factory.getTeacher();
        Schoolboy schoolboy1 = factory.getSchoolboy();

        director1.consult();
        teacher1.teach();
        schoolboy1.study();
    }
}
