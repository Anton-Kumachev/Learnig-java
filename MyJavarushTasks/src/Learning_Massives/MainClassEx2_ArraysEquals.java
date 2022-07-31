package Learning_Massives;

import java.util.Arrays;

public class MainClassEx2_ArraysEquals {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] numbersCopy = Arrays.copyOf(numbers, numbers.length);

        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(numbers, numbersCopy));

        System.out.println(Arrays.deepToString(numbersCopy));
    }
}