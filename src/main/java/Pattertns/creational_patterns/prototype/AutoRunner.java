package Pattertns.creational_patterns.prototype;

public class AutoRunner {
    public static void main(String[] args) {
        Auto ma = new Auto("one","1000","salon");
        System.out.println(ma);

        AutoFactory factory = new AutoFactory(ma);
        Auto copy = factory.cloneAuto();
        System.out.println(copy);
    }
}
