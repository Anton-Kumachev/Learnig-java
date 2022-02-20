package Learning_Massives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Пример 2.
//Ввод 10 строк (String) с клавиатуры:
public class MainClassExample2_1 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < list.length; i++)
        {
            list[i] = reader.readLine();
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
