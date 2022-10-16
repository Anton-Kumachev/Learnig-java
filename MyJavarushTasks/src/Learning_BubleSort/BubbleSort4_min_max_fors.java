package Learning_BubleSort;

//Сортировка пузырьком по убыванию

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort4_min_max_fors {
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
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}