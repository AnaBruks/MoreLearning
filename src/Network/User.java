package Network;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions = new ArrayList<>();
    public String getUsername()  { return username; }
    public List<User> getSubscriptions() { return subscriptions; }

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }
    public void subscribe(User user){
        // подписывает пользователя на пользователя user
        this.subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        //return this.subscriptions.contains(user);
        for (User currentUser : subscriptions) {
            if (currentUser.getUsername().equals(user.getUsername())){
                return true;
            }
    }
        return false;
        //Сравнивая имена пользователей из списка subscriptions с именем поступившего в аргументы пользователя user
    }
    public String toString(){
        return getUsername();
    }
    public void sendMessage(User user, String text){
        MessageDatabase.getMessages().add(new Message(this, user, text));
        /*
    send сообщение с текстом text пользователю user. Здесь должен использоваться
    статический метод из MessageDatabase.
         */
    }
    public boolean isFriend(User user1, User user2){
        return (user1.isSubscribed(user2) && user2.isSubscribed(user1));
    }
    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

}
