package Pattertns.behavior.state;

public interface DeliveryState {
    void next( Delivery delivery);
    void prev(Delivery delivery);
    void printStatus();
}
