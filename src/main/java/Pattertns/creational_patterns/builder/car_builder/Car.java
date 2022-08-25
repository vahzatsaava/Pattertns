package Pattertns.creational_patterns.builder.car_builder;

public class Car {
    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public Car(String chassis, String body, String paint, String interior) {
        this.chassis = chassis;
        this.body = body;
        this.paint = paint;
        this.interior = interior;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getBody() {
        return body;
    }

    public String getPaint() {
        return paint;
    }

    public String getInterior() {
        return interior;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassis='" + chassis + '\'' +
                ", body='" + body + '\'' +
                ", paint='" + paint + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}