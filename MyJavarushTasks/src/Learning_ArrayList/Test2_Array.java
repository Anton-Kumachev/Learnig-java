package Learning_ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test2_Array {
    public static void main(String[] args)
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

// ввод строк с клавиатуры
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++)
        {
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            list[i] = s;
        }

// вывод содержимого массива
// на экран в обратном порядке
        for (int i = 0; i < list.length; i++)
        {
            int j = list.length - i - 1;
            System.out.println( list[j] );
        }
    }
}
