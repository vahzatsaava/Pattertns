package Pattertns.behavior.interpretator;

public class InterpreterRunner {
    public static void main(String[] args) {

    }
    public static Exspression getJavaExpression(){
        Exspression java = new TerminalExpression("java");
        Exspression javaCore = new TerminalExpression("javaCore");
        return new OrExpression(java,javaCore);
    }
    public static Exspression getJavaEEExpression(){
        Exspression java = new TerminalExpression("java");
        Exspression spring = new TerminalExpression("spring");
        return new AndExpression(java,spring);
    }
}
