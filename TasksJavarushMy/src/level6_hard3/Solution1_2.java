package level6_hard3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Числа по возрастанию
*/
//Решение через ArrayList и цикл for
public class Solution1_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            sum.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(sum); //Сорировка для списка ArrayList, этот метод можно вызывать ТОЛЬКО
                               //для списков
        for (int i = 0; i < 5; i++) {
            System.out.println(sum.get(i));
        }
    }
}
