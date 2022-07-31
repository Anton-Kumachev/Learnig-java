package level6_hard3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Числа по возрастанию
*/

public class Solution3_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayNum = new int[5];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(reader.readLine());//Заполняем массив на 5 элементов с клавиатуры
        }
        sort(arrayNum); //Самописный метод сортировки
        for (int x : arrayNum) { //Цикл foreach, цикл проходит по всем значениям элементов массива arrayNum
            System.out.println(x);
        }
    }
//Сортировка пузырьком
    public static void sort(int[] array) { //Метод соритровки пузырьком
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) { //Если левый элемент больше правого
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp; //Меняем их местами
                }
            }
        }
    }
}
