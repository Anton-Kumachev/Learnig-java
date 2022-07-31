package Learning_ArrayList;

//Пример 2: То же, чётные числа добавляются в конец списка, нечётные — в начало.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainEx2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                list.add(x);          //добавление в конец
            else
                list.add(0, x);      //вставка в начало
        }
        System.out.println("Массив получился: " + list);
    }
}
