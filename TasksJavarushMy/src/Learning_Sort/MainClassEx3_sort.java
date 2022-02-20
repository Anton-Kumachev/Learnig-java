package Learning_Sort;

//Сортировка массива по возрастанию

import java.util.Arrays;

public class MainClassEx3_sort {
    public static void main(String[] args) {

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        Arrays.sort(numbers);

        System.out.println("Неправильный вывод массива: " + numbers.toString() + "]");
        System.out.println("Правильный вывод массива: " + Arrays.toString(numbers));

    }
}