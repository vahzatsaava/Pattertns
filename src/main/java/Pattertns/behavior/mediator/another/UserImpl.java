package Pattertns.behavior.mediator.another;

public class UserImpl extends User1{

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " Sending Message " + message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + "Receive message " + message);
    }
}
