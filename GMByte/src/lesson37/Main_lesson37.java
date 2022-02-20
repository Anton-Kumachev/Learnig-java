package lesson37;
// Уроки Java - №37 Коллекции. ArrayList.

import java.util.ArrayList;

public class Main_lesson37 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(); // создание коллекции
        al.add("1Hello!"); // добавление ячейки [0] в коллекцию
        al.add("2Hello!"); // добавление ещё одной ячейки [1] в коллекцию
        al.add("3Hello!"); // и добавление ещё одной ячейки [2] в коллекцию

        System.out.println(al.size()); // определение размера коллекции

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i)); // метод get() используется для получения значения элемента коллекции
        }

        al.set(1, "Goodbye2!"); // замена значения ячейки [1] коллекции
        al.set(0, "Goodbye1!"); // замена значения ячейки [0] коллекции
        al.set(2, "Goodbye3!"); // замена значения ячейки [2] коллекции

        al.remove(0); // удаление ячейки под индексом [0], нумерация ячеек сместилась
        al.add(1, "23"); // добавление нового значения ячейки [1], при этом старая ячейка [1] сместилась в ячейку [2]

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
