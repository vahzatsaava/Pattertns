package Pattertns.behavior.interpretator.product;

import Pattertns.behavior.interpretator.Exspression;

import java.util.Stack;

public class TestInterpreterPattern {
    public static void main(String[] args) {
        String tok = "7 3 - 2 1 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokArr = tok.split(" ");
        for (String s:tokArr) {
            if (ExpressionUtills.isOperator(s)){
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression operator = ExpressionUtills.getOperator(s,left,right);
                int result = operator.interpret();
                stack.push(new Number(result));
            }else {
                Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println(stack.pop().interpret());
    }
}
