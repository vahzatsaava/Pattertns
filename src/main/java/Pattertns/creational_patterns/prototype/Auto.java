package Pattertns.creational_patterns.prototype;

public class Auto implements Copyable{
    private String name;
    private String price;
    private String source;

    public Auto(String name, String price, String source) {
        this.name = name;
        this.price = price;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    @Override
    public Copyable copy() {
        Auto auto1 = new Auto(name,price,source);
        return auto1;
    }
}
