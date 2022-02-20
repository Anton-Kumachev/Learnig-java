package lesson31_3;
//Отличный пример из статьи на Javarush
//Источник: https://javarush.ru/groups/posts/1878-mnogopotochnostjh-v-java

public class HR {// Класс для демонстрации работы потока
    public static void main(String[] args) {
        // Создаем две очереди
        PeopleQueue queue1 = new PeopleQueue("Иван","Сергей","Николай","Фердинанд","Василий");
        PeopleQueue queue2 = new PeopleQueue("Мария","Людмила","Алиса","Карина","Ольга");

        System.out.println("Начали!"); // Сообщение из главного потока программы
        queue1.start();    //Запускаем одну очередь (дочерний поток)
        queue2.start(); //Запускаем вторую (дочерний поток)
    }
}
