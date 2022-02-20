package Learning_Massives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Пример 3.
//Вывод массива на экран:
public class MainClassExample3 {

    public static void main(String[] args) throws IOException
    {
        int[] list = new int[10];

        //заполнение массива
        for (int i = 0; i < list.length; i++)
        {
            list[i] = i;
        }

        //вывод на экран
        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }
    }
}
