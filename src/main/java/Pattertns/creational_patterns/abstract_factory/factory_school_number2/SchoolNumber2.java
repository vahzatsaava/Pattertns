package Pattertns.creational_patterns.abstract_factory.factory_school_number2;

import Pattertns.creational_patterns.abstract_factory.person.Director;
import Pattertns.creational_patterns.abstract_factory.person.PersonalFactory;
import Pattertns.creational_patterns.abstract_factory.person.Schoolboy;
import Pattertns.creational_patterns.abstract_factory.person.Teacher;

public class SchoolNumber2 implements PersonalFactory {
    @Override
    public Director getDirector() {
        return new DirectorSchool_2();
    }

    @Override
    public Teacher getTeacher() {
        return new Teache_2();
    }

    @Override
    public Schoolboy getSchoolboy() {
        return new Scholboys_2();
    }
}
