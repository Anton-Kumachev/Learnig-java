package Learning_Sort;

//Сортировка массива по возрастанию

import java.util.Arrays;

public class MainClassEx2_sort {
    public static void main(String[] args) {

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        for (int i = numbers.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
           /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами*/
                if (numbers[j] > numbers[j + 1]) { //Если левый элемент массива больше, чем правый, то меняем их местами
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}