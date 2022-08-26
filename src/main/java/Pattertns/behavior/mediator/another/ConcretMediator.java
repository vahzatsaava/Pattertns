package Pattertns.behavior.mediator.another;

import java.util.ArrayList;
import java.util.List;

public class ConcretMediator implements ChatMediator {
    private List<User1> users;

    public ConcretMediator() {
        this.users = new ArrayList();
    }

    @Override
    public void sendMessage(String message, User1 user1) {
        for (User1 i:users) {
            if (i != user1){
                i.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User1 user1) {
        this.users.add(user1);
    }
}
