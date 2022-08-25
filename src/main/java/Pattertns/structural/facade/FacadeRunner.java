package Pattertns.structural.facade;

public class FacadeRunner {
    public static void main(String[] args) {
        FacadeCars facadeCars = new FacadeCars();
        facadeCars.start();
        System.out.println("\n======================\n");
        facadeCars.move();
    }
}
