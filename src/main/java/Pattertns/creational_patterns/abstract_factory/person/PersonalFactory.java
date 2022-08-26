package Pattertns.creational_patterns.abstract_factory.person;

public interface PersonalFactory {
    Director getDirector();
    Teacher getTeacher();
    Schoolboy getSchoolboy();
}
