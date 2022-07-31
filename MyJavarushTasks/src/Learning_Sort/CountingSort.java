package Learning_Sort;

//Сортировка подсчётом
//Разобраться в этом решении ((!!!РАБОТАТЕТ НЕ ВЕРНО!!!))

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] theArray = {50, 25, 8, 29, 14, 36, 91, 22, 12, 10, 100};
        countingSort(theArray, 100);
        System.out.println(Arrays.toString(theArray));
    }

    public static int[] countingSort(int[] theArray, int maxValue) {
        // Массив со "счётчиками" размером от 0 до максимального значения
        int numCounts[] = new int[maxValue + 1];
        // В соответствующей ячейке (индекс = значение) увеличиваем счётчик
        for (int num : theArray) {
            numCounts[num]++;
        }
        // Подготавливаем массив для отсортированного результата
        int[] sortedArray = new int[theArray.length];
        int currentSortedIndex = 0;
        // идём по массиву со "счётчиками"
        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            // идём по количеству значений
            for (int k = 0; k < count; k++) {
                sortedArray[currentSortedIndex] = n;
                currentSortedIndex++;
            }
        }
        return sortedArray;
    }
}
