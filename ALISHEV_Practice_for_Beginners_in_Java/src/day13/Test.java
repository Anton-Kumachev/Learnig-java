package day13;
//Тестировани небольшой социальной сети на Java:
/*  В методе main() этого класса необходимо создать трех пользователей.
    Затем необходимо:
    -    Отправить 2 сообщения от пользователя 1 пользователю 2
    -    Отправить 3 сообщения от пользователя 2 пользователю 1
    -    Отправить 3 сообщения от пользователя 3 пользователю 1
    -    Отправить 3 сообщения от пользователя 1 пользователю 3
    -    Отправить 1 сообщение от пользователя 3 пользователю 1

    Сообщения могут быть любыми.
    После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью
    метода showDialog().*/

//Класс, где в методе main() мы будем тестировать нашу соц.сеть

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Anton");
        User user2 = new User("Mark");
        User user3 = new User("Liza");

        user1.sendMessage(user2, "Hello from user1 - Anton!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi, father!");
        user2.sendMessage(user1, "I'm user2 - your son - Mark! Nice to meet you.");
        user2.sendMessage(user1, "I'm fine, and you?");

        MessageDatabase.showDialog(user1, user2);

        user3.sendMessage(user1, "Hey! I'm user3 - your wife, Liza, my dear Anton!");
        user3.sendMessage(user1, "Do you recognized me? ");
        user3.sendMessage(user1, "We have two children with you.");

        user1.sendMessage(user3, "Hey, Liza! Of course I recognized you!");
        user1.sendMessage(user3, "I so happy that we live together whith you and our children!");
        user1.sendMessage(user3, "Let's go to the Disney Land all family tomorrow?");

        user3.sendMessage(user1, "Yep, I think it's good idea, my dear Anton! I love you so much!");

        MessageDatabase.showDialog(user1, user3);
    }
}
