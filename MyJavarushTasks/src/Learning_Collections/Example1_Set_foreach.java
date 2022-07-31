package Learning_Collections;

import java.util.HashSet;
import java.util.Set;

//Вывод на экран элементов Set

public class Example1_Set_foreach {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        for (String text : set)
        {
            System.out.println(text);
        }
    }
}