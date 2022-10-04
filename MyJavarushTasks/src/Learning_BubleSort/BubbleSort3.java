package Learning_BubleSort;

//Сортировка пузырьком

public class BubbleSort3 {
    public static void main(String[] args) {

    }

    public static void bubblesort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true; //Изначально считается, что массив отсортирован
            for (int i = 0; i < lastUnsorted; i++) { //Далее проходим по всему массиву
                if (array[i] > array[i + 1]) { //Если мы находим в массиве элементы, подходящие под эти условия
                    swap(array, i, i + 1);
                    isSorted = false; //Значит массив не отсортирован, возвращаемся в начало цикла while
                }
            }
            lastUnsorted--; //Уменьшение массива, после сортировки каждого элемента
        }
    }
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}