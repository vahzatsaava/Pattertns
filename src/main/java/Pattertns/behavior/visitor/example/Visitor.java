package Pattertns.behavior.visitor.example;

public interface Visitor {
    void visit(XmlElement xmLelement);

    void visit(JsonElement jsonElement);
}
