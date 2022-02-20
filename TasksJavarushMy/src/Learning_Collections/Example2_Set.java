package Learning_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example2_Set {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Stop");
        set.add("Look");
        set.add("Listen");

        Iterator<String> iterator = set.iterator(); //получение итератора для множества

        while (iterator.hasNext()) //проверка, есть ли ещё элементы
        {   //получение текущего элемента и переход на следующий
            String text = iterator.next();
            System.out.println(text);
        }
    }
}