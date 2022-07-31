package Learning_Sort;

import java.util.Arrays;

public class MainClassEx1_sort {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3, 7}; //объявляем и инициализируем массив на 5 элементов
        System.out.println(array);//пытаемся вывести наш массив на экран без метода toString - получаем 16-ричное число
        System.out.println(Arrays.toString(array));//печатаем массив "правильно", через метод toString()
        Arrays.sort(array, 0, 4); //сортируем весь массив от нулевого до четвёртого элемента
        System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
        int key = Arrays.binarySearch(array, 5); // ищем key - число 5 в отсортированном массиве.
        //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
        System.out.println(key);//распечатываем индекс искомого числа
        System.out.println(Arrays.binarySearch(array, 0));//а теперь попробуем найти число, которого в массиве нет,
        // и сразу же выведем результат на экран

    }
}