package Pattertns.behavior.strategy;

public class RunnerStrategy {
    public static void main(String[] args) {
        Prius prius = new Prius();
        TeslaCar teslaCar = new TeslaCar();
        prius.fillAuto();
        teslaCar.fillAuto();

    }
}
