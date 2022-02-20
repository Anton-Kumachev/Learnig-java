package Learning_Massives;

//Метод System.arraycopy() для копирования элементов из одного массива в другой

import java.util.Arrays;

public class MainClassEx4_arraycopy_part {

    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        int [] numbersCopy2 = Arrays.copyOf(numbers, 4); //Копируем часть массива
        int [] numbersCopy3 = Arrays.copyOfRange(numbers, 2,6); //Копируем часть массива "из середины"

        System.out.println("Массив numbers: " + Arrays.toString(numbers));
        System.out.println("Массив numbersCopy: " + Arrays.toString(numbersCopy));
        System.out.println("Массив numbersCopy3: " + Arrays.toString(numbersCopy2));
    }
}