package day13;

//Сущность “Пользователь”

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username; //Имя пользователя
    private List<User> subscriptions; //В этом списке должны храниться те пользователи, на которых подписан пользователь.

    //Конструктор должен принимать в качестве аргумента только имя пользователя. Также, должен инициализировать
    // поле “подписки” пустым списком = new ArrayList<>();
    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    //Этот метод подписывает пользователя на пользователя user
    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    //Этот метод  возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
    public boolean isSubscribed(User user) {
        for (User currentUser : subscriptions) {
            if (currentUser.getUsername().equals(user.getUsername()));
            return true;
        }
        return false;
    }

    //Этот метод возвращает True, если пользователь user является другом и False, если пользователь user не
    //является другом.
    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    //Этот метод - отправляет сообщение с текстом text пользователю user. Здесь должен использоваться
    //статический метод из MessageDatabase.
    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessege(this, user, text);
    }

    //Этот метод возвращает строковое представление пользователя (имя пользователя).
    @Override
    public String toString() {
        return username;
    }
}
