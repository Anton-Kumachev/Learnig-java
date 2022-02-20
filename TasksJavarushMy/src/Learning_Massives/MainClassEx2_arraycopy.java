package Learning_Massives;

//Метод System.arraycopy() для копирования элементов из одного массива в другой

import java.util.Arrays;

public class MainClassEx2_arraycopy {

    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        int[] numbersCopy = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            numbersCopy[i] = numbers[i];
        }
        System.out.println("Массив numbers: " + Arrays.toString(numbers));
        System.out.println("Массив numbersCopy: " + Arrays.toString(numbersCopy));
    }
}