package Pattertns.behavior.visitor.example;

public class JsonElement extends Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
