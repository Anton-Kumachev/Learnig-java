package lesson41_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main_lesson41_2 {
    public static void main(String[] args) {

        // Создаём коллекцию
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Добавляем элементы
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        // Получаем текущее время
        long arrayListTime = System.currentTimeMillis();

        // Вставляем элемент
        arrayList.get(150000); // - получение элемента

        // Вычисляем потраченное время
        long arrayResultTime = System.currentTimeMillis() - arrayListTime;

        // Выводимм результат на экран
        System.out.println("Для ArrayList результат равен " + arrayResultTime);

        // Теперь делаем тоже самое для LinlList ------------------------------------

        // Получаем текущее время
        long linkedListTime = System.currentTimeMillis();

        // Вставляем элемент
        linkedList.get(150000); // - получение элемента

        // Вычисляем потраченное время
        long linkedResultTime = System.currentTimeMillis() - linkedListTime;

        // Выводимм результат на экран
        System.out.println("Для LinkedList результат равен " + linkedResultTime);


    }
}
