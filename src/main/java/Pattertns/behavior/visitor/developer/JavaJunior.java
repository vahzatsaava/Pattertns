package Pattertns.behavior.visitor.developer;

public class JavaJunior implements Developer{
    @Override
    public void create(ClassJava classJava) {
        System.out.println("write bud code");
    }

    @Override
    public void create(Database database) {
        System.out.println("bud base");
    }

    @Override
    public void create(Test test) {
        System.out.println("bud test");
    }
}
