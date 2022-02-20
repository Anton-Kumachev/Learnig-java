package Learning_Collections;
//Вывод на экран элементов List

import java.util.ArrayList;
import java.util.List;

public class Example3_List_foreach {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        for (String text : list)
        {
            System.out.println(text);
        }
    }
}
