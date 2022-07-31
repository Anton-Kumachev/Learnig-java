package Learning_Massives;

import java.io.IOException;

//Пример 5.
//Поиск минимального (min) элемента в массиве:
public class MainClassExample5 {

    public static void main(String[] args) throws IOException
    {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0]; //Просто выбираем любую ячейку массива и сравниваем остальные с ней,
                            // находим меньшее, присваиваем её переменной min
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] < min)
            {
                min = list[i];
            }
        }

        System.out.println ("Min is " + min);
    }
}