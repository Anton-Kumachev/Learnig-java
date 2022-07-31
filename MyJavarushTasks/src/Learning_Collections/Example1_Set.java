package Learning_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Вывод на экран элементов Set

public class Example1_Set {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Мама");
        set.add("Мыла");
        set.add("Раму");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();
            System.out.println(text);
        }
    }
}