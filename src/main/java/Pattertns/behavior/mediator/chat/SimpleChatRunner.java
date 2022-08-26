package Pattertns.behavior.mediator.chat;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        Admin admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat,"user1");
        User user2 = new SimpleUser(chat,"user2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.getMessage("Hello i am user 1");
        admin.sendMessage("i am admin");
    }
}
