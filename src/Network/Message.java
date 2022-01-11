package Network;

import java.time.LocalDate;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private LocalDate date;

    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    public String getText() {
        return text;
    }
    public LocalDate getDate() {
        return date;
    }

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = LocalDate.now();
    }

    public String toString(){
        String s = "FROM: " + getSender().getUsername() + "\n"
                + "TO: " + getReceiver().getUsername() + "\n"
                + "ON: " + getDate() +  "\n" +
                getText() +  "\n";
        return s;
    }
}
