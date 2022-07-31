package level6_hard3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Числа по возрастанию
*/
//Решение через массив, цикл for, foreach и Arrays.sort()
public class Solution3_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayNum = new int[5];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(reader.readLine());//Заполняем массив на 5 элементов с клавиатуры
        }
        Arrays.sort(arrayNum);//Сортировка массива - этот метод можно вызывать ТОЛЬКО для массивов
        for (int x : arrayNum) { //Цикл foreach, цикл проходит по всем значениям элементов массива arrayNum
            System.out.println(x);
        }
    }
}
