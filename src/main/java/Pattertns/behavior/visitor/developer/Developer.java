package Pattertns.behavior.visitor.developer;

public interface Developer {
    void create(ClassJava classJava);
    void create(Database database);
    void create(Test test);
}
