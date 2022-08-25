package Pattertns.behavior.state;

public class runner {
    public static void main(String[] args) throws InterruptedException {
        Delivery delivery = new Delivery();
        while (true){
            delivery.printStatus();
            Thread.sleep(3000);
            delivery.nextState();
        }

    }
}
