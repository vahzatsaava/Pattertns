package Pattertns.behavior.visitor.example;

public class Consumer implements Visitor{
    @Override
    public void visit(XmlElement xmLelement) {
        System.out.println("VisiterX writes something");
    }

    @Override
    public void visit(JsonElement jsonElement) {
        System.out.println("Visitor X writes jsonElements");
    }
}
