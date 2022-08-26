package Pattertns.creational_patterns.abstract_factory.factory_school_number1;

import Pattertns.creational_patterns.abstract_factory.person.Director;
import Pattertns.creational_patterns.abstract_factory.person.PersonalFactory;
import Pattertns.creational_patterns.abstract_factory.person.Schoolboy;
import Pattertns.creational_patterns.abstract_factory.person.Teacher;

public class SchoolNumber1 implements PersonalFactory {
    @Override
    public Director getDirector() {
        return new DirectorShool();
    }

    @Override
    public Teacher getTeacher() {
        return new TeacherSchool();
    }

    @Override
    public Schoolboy getSchoolboy() {
        return new Schoolboys1();
    }
}
