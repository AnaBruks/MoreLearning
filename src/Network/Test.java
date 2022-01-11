package Network;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("Nastia");
        User u2 = new User("Dima");
        User u3 = new User("Hui");

        u1.sendMessage(u2,"Hello");
        u1.sendMessage(u2,"2");
        u2.sendMessage(u1,"3");
        u2.sendMessage(u1,"4?");
        u2.sendMessage(u1,"5");
        u3.sendMessage(u1,"6");

        MessageDatabase.showDialog(u1,u2);
       MessageDatabase.showDialog(u1,u3);
    }
}
