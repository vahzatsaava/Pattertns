package Pattertns.behavior.visitor.example;

public class RunnerVis {
    public static void main(String[] args) {
        Documents documents = new Documents();
        Consumer consumer = new Consumer();
        VisitorClass visitorClass = new VisitorClass();

        documents.accept(consumer);
        System.out.println("***");
        documents.accept(visitorClass);

    }
}
