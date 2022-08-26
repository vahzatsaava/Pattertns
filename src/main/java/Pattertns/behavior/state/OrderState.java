package Pattertns.behavior.state;

public class OrderState implements DeliveryState {

    @Override
    public void next(Delivery delivery) {
        delivery.setState(new DeliveryClassState());
    }

    @Override
    public void prev(Delivery delivery) {
        System.out.println("the package is in int root state ");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet. ");
    }
}
