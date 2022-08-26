package Pattertns.behavior.state;

public class ReceivedState implements DeliveryState {
    @Override
    public void next(Delivery delivery) {
        delivery.setState(new OrderState());
    }

    @Override
    public void prev(Delivery delivery) {
        delivery.setState(new DeliveryClassState());
    }

    @Override
    public void printStatus() {
        System.out.println("is done ");
    }
}
