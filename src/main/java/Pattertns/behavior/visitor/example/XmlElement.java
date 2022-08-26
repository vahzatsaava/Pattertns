package Pattertns.behavior.visitor.example;

public class XmlElement extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
