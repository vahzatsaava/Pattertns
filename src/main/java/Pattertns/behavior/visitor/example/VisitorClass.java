package Pattertns.behavior.visitor.example;

public class VisitorClass implements Visitor{
    @Override
    public void visit(XmlElement xmLelement) {
        System.out.println("Visitor Y writes xml");
    }

    @Override
    public void visit(JsonElement jsonElement) {
        System.out.println(" Visitor Y writes json");
    }
}
