package lesson41;

import java.util.ArrayList;
import java.util.LinkedList;

public class Homework_lesson41 {
    public static void main(String[] args) {

        // Создаём коллекцию
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Добавляем элементы
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        // Получаем текущее время
        long arrayListTime = System.currentTimeMillis();

        // Вставляем элемент
        arrayList.add(10195,1203); // - добавление элемента
        //arrayList.get(10195); // - получение элемента
        //arrayList.remove(10195); // - удвление элемента

        // Вычисляем потраченное время
        long arrayResultTime = System.currentTimeMillis() - arrayListTime;

        // Выводимм результат на экран
            System.out.println("Для ArrayList результат равен " + arrayResultTime);

        // Теперь делаем тоже самое для LinlList ------------------------------------

        // Получаем текущее время
        long linkedListTime = System.currentTimeMillis();

        // Вставляем элемент
        linkedList.add(500,1203); //- добавление элемента
        //linkedList.get(10195); // - получение элемента
        //linkedList.remove(500); // - удвление элемента

        // Вычисляем потраченное время
        long linkedResultTime = System.currentTimeMillis() - linkedListTime;

        // Выводимм результат на экран
        System.out.println("Для LinkedList результат равен " + linkedResultTime);


    }
}
