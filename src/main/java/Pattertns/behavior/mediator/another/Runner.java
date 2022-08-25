package Pattertns.behavior.mediator.another;

public class Runner {
    public static void main(String[] args) {
        ConcretMediator mediator = new ConcretMediator();
        UserImpl user = new UserImpl(mediator,"Garry");
        UserImpl user2 = new UserImpl(mediator,"gy");
        UserImpl user3 = new UserImpl(mediator,"harry");
        UserImpl user4 = new UserImpl(mediator,"barry");
        mediator.addUser(user);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user.send("Hello guys !!!");

    }
}
