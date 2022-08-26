package Pattertns.behavior.visitor.example;

import java.util.ArrayList;
import java.util.List;

public class Documents extends Element {
    private List<Element> elementList = new ArrayList<>();

    public Documents() {
        elementList.add(new JsonElement());
        elementList.add(new XmlElement());
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element: elementList){
            element.accept(visitor);
        }
    }

}
