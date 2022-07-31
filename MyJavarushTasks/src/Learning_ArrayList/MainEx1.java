package Learning_ArrayList;

//Пример 1: Ввод списка целых чисел с клавиатуры

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainEx1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>() ;

        while (true) //Числа можно вводит до бесконечности, пока не введёшь пустое поле, тогда программа
                     //закончится и выведет на экран все введённые числа
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }
        System.out.println("Список состоит из массива чисел: " + list);
    }
}
