package Pattertns.creational_patterns.abstract_factory.factory_school_number1;

import Pattertns.creational_patterns.abstract_factory.person.Teacher;

public class TeacherSchool implements Teacher {
    @Override
    public void teach() {
        System.out.println("Teacher teach the students");
    }
}
