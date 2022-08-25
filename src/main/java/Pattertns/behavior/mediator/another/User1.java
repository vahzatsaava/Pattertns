package Pattertns.behavior.mediator.another;

public abstract class User1 {
    protected ChatMediator mediator;
    protected String name;

    public User1(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receiveMessage(String message);
}
