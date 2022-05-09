package day13;

//Класс, который будет заниматься хранением сообщений

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    //Статическое поле “сообщения” (англ. messages), которое будет хранить список из сообщений (объектов класса
    //Message). Это поле должно инициализироваться пустым списком. Этот список и есть наша условная “база данных”,
    //которая хранит все сообщения в соц. сети.
    private static List<Message> messages = new ArrayList<>();

    //Нет конструктора. Объекты класса MessageDatabase создаваться не будут (все методы и поля статические).

    //Этот метод “отправляет” новое сообщение от пользователя sender пользователю receiver с текстом text. Отправка
    // в нашем контексте означает добавление сообщения в нашу “базу данных”.
    public static void addNewMessege(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    //этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
    /*user1: Привет!
    user2: Привет, user1!
    user1: Как у тебя дела?
    user2: Все ок, спасибо :)*/
    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2
                    || message.getSender() == u2 && message.getReceiver() == u1) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}
