package level6_hard3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Числа по возрастанию
*/
//Решение через ArrayList
public class Solution1_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());

        ArrayList<Integer> sum = new ArrayList<Integer>();
        sum.add(num1);
        sum.add(num2);
        sum.add(num3);
        sum.add(num4);
        sum.add(num5);

        Collections.sort(sum);//Сорировка для списка ArrayList, этот метод можно вызывать ТОЛЬКО
                              //для списков
        System.out.println(sum.get(0));
        System.out.println(sum.get(1));
        System.out.println(sum.get(2));
        System.out.println(sum.get(3));
        System.out.println(sum.get(4));
    }
}