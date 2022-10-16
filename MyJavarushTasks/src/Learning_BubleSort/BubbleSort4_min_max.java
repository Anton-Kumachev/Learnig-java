package Learning_BubleSort;

//Сортировка пузырьком по убыванию

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort4_min_max {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array); //Сортируем по убыванию (самописный метод)

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                int min = array[i];
                if (array[i + 1] < min) {
                    array[i] = array[i + 1];
                    array[i + 1] = min;
                    isSorted = false;
                }
            }
        }
    }
}