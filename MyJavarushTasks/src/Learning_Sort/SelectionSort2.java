package Learning_Sort;

//Сортировка выбором

public class SelectionSort2 {
    public static void printArray (int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void swap (int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private static void selectionSort (int[] array) {
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(array, i, min);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println("Изначальный массив: ");
        printArray(array);
        selectionSort(array);
        System.out.println("Массив отсортирован: ");
        printArray(array);
    }
}