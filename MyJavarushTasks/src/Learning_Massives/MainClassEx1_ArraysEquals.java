package Learning_Massives;

import java.util.Arrays;

public class MainClassEx1_ArraysEquals {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};

        System.out.println(numbers.equals(numbers2) + " - неверное сравнение");

        //Класс Arrays содержит переопределенный метод equals(), который делает ровно то, что нам нужно:
        System.out.println(Arrays.equals(numbers, numbers2) + " - верное сравнение");
    }
}