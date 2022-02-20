package Learning_ArrayList;

//Разделение массива на два — чётных и нечётных чисел

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainEx4_bonus {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)    //если x - чётное
                even.add(x);   // добавляем x в коллекцию четных чисел
            else
                odd.add(x);    // добавляем x в коллекцию нечетных чисел
        }

        System.out.println("Список чётных чисел: " + even);
        System.out.println("Список нечётных чисел: " + odd);
    }
}
