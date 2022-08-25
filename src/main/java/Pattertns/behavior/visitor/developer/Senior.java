package Pattertns.behavior.visitor.developer;

public class Senior implements Developer{
    @Override
    public void create(ClassJava classJava) {
        System.out.println("write good code");
    }

    @Override
    public void create(Database database) {
        System.out.println("crete great database");
    }

    @Override
    public void create(Test test) {
        System.out.println("create good tests");
    }
}
