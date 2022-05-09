package day13;

//Сущность “Сообщение”

import java.util.Date;

public class Message {
    private User sender; //Отправитель сообщения
    private User receiver; //Получатель сообщения
    private String text; //Текст сообщения
    private Date date; //Дата отправки сообщения

    //Конструктор должен принимать 3 аргумента - отправителя, получателя и текст сообщения. Также, конструктор должен
    //назначать полю date текущее время (то есть время создания объекта Message).
    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
    @Override
    public String toString() {
        return "FROM: " + this.sender + "\n" +
               "TO: " + receiver + "\n" +
               "ON: " + date + "\n" +
               "Текст сообщения: " + text + "\n";
    }
}
