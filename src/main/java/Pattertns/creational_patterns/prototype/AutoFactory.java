package Pattertns.creational_patterns.prototype;

public class AutoFactory {
    private Auto auto;

    public AutoFactory(Auto auto) {
        this.auto = auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    Auto cloneAuto() {
        return (Auto) auto.copy();
    }
}
