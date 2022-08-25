package Pattertns.behavior.interpretator;

public class AndExpression implements Exspression{
    private  Exspression exspression1;
    private Exspression exspression2;

    public AndExpression(Exspression exspression1, Exspression exspression2) {
        this.exspression1 = exspression1;
        this.exspression2 = exspression2;
    }

    @Override
    public boolean interpret(String context) {
        return exspression1.interpret(context) && exspression2.interpret(context);
    }
}
