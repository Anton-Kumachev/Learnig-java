package Learning_Sort;

import java.util.Arrays;

//Сортировка пузырьком

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] array = {10, 2, 12, 3, 1, 4, 5};

        System.out.println(array); // notRight output of massive
        System.out.println("Первоначальный массив:");
        System.out.println(Arrays.toString(array)); //Right output of massive
        boolean newIteration = true;
        while (newIteration) {
            newIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    newIteration = true;
                }
            }
        }
        System.out.println("Полный проход сортировки:");
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}