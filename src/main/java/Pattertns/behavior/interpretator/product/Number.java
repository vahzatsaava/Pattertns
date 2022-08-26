package Pattertns.behavior.interpretator.product;

public class Number implements Expression{
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
