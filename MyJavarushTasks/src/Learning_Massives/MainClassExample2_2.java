package Learning_Massives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Пример 2.
//Ввод 10 чисел (int) с клавиатуры:
public class MainClassExample2_2 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
            System.out.println(list[i]);

        }
    }
}
