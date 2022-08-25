package Pattertns.behavior.state;

public class Delivery {
    private DeliveryState state = new OrderState();

    public DeliveryState getState() {
        return state;
    }

    public void setState(DeliveryState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }
    public void nextState(){
        state.next(this);
    }
    public void printStatus(){
        state.printStatus();
    }
}
