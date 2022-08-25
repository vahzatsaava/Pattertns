package Pattertns.behavior.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    private Admin admin;
    private List<User> listUsers = new ArrayList<>() ;

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        listUsers.add(user);
    }


    @Override
    public void sendMessage(String message, User user) {
        for (User i :listUsers) {
           if (i != user){
               i.getMessage(message);
           }
        }
        admin.getMessage(message);
    }
}
