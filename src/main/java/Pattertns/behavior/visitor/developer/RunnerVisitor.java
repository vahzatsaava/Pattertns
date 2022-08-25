package Pattertns.behavior.visitor.developer;

public class RunnerVisitor {
    public static void main(String[] args) {
        ProjectTEst tEst = new ProjectTEst();
        JavaJunior javaJunior = new JavaJunior();
        Senior senior = new Senior();

        tEst.beWritten(javaJunior);
        System.out.println("*****");

        tEst.beWritten(senior);
    }
}
