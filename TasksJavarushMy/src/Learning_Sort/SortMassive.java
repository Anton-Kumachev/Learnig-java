package Learning_Sort;

//Сортировка массивов

import java.io.IOException;
import java.util.Arrays;

public class SortMassive {
    public static void main(String[] args) throws IOException {
        int [] array1 = {50, 25, 8, 29, 14, 36, 91, 22, 12, 10, 100};

        System.out.println("Массив  array1 получился: " + Arrays.toString(array1));
        System.out.println("Размер массива array1: " + array1.length);

        System.out.println("Массив array1 после сортировки:");
        Arrays.sort(array1); //Сортировка методом sort() системного класса Arrays

        System.out.println("Это 16-ричное число: " + array1);
        System.out.println("а если по нормальному: " + Arrays.toString(array1)); //метод toString() - для вывода
        // на консоль одномерного массива

        int [] array2 = {50, 25, 8, 29, 14, 36, 91, 22, 12, 10, 100};
        //Метод сортировки пузырьком:
        for (int i = array2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array2[j] > array2[j + 1]) {
                    int tmp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный(пузырьком) массив array2: " + Arrays.toString(array2));


        int [] [] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}}; //Двумерный массив
        System.out.println("Двумерный массив:" + Arrays.deepToString(twoDimArray)); //метод deepToString() - для
        // вывода на консоль двумерного массива

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте список из 5-ти чисел, вводом с клавиатуры");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println("Размер списка: " + list.size());*/
    }
}
