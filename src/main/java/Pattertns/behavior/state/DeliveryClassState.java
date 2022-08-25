package Pattertns.behavior.state;

public class DeliveryClassState implements DeliveryState {
    @Override
    public void next(Delivery delivery) {
        delivery.setState(new ReceivedState());
    }

    @Override
    public void prev(Delivery delivery) {
        delivery.setState(new OrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.);");
    }
}
