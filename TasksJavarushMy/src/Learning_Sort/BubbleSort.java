package Learning_Sort;

import java.util.Arrays;

//Сортировка пузырьком (ТОЛЬКО ОДИН ПРОХОД - НЕ ПОЛНАЯ СОРТИРОВКА)

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};

        System.out.println("Первоначальный массив:");
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i-1);
            }
        }
        System.out.println("Первый проход сортировки:");
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
