package Learning_Massives;

import java.io.IOException;

//Пример 4.
//Быстрая (статическая) инициализация. Сумма (sum) элементов массива:
public class MainClassExample4 {

    public static void main(String[] args) throws IOException
    {
        //это статическая инициализация
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //подсчёт суммы элементов
        int sum = 0;
        for (int i = 0; i < list.length; i++)
        {
            sum += list[i]; //sum = sum + list[i];
        }
        System.out.println("Длина массива: " + list.length);
        System.out.println("Сумма элементов массива: " + sum);
    }
}
