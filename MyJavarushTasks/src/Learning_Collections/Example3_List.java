package Learning_Collections;
//Вывод на экран элементов List

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example3_List {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Мама");
        list.add("Мыла");
        list.add("Раму");

        Iterator<String> iterator = list.iterator();//получение итератора для списка

        while (iterator.hasNext())      //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
