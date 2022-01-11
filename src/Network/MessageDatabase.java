package Network;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List <Message> message = new ArrayList<>();
    public static List<Message> getMessages(){ return message; }


    public static void sendMessage(User u1, User u2, String text){
        // этот метод “отправляет” новое сообщение от пользователя u1(sender) пользователю u2(receiver) с текстом text. Отправка в нашем контексте означает добавление
        //сообщения в нашу “базу данных”
        message.add(new Message(u1, u2, text));
    }
    public static void showDialog(User u1, User u2){
        for (Message m : message){
            if (m.getSender() == u1 && m.getReceiver() == u2 || m.getSender() == u2 && m.getReceiver() == u1)
                System.out.println(m.getSender().getUsername() + ": "+ m);
        }
    }

}
