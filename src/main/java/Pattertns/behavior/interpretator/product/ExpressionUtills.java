package Pattertns.behavior.interpretator.product;

import Pattertns.behavior.interpretator.Exspression;

import java.util.function.Predicate;

public class ExpressionUtills {
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        return switch (s) {
            case "+" -> new Add(left, right);
            case "*" -> new Product(left, right);
            case "-" -> new Substract(left, right);
            default -> null;
        };
    }
}
