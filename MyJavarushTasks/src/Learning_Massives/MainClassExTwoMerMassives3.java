package Learning_Massives;
// Двумерные массивы

import java.util.Arrays;

public class MainClassExTwoMerMassives3 {
    public static void main(String[] args) {

        int[][] myArray = {{18, 28, 18, 22, 31 }, {28, 45, 90, 50, 99}, {45, 3, 14, 12, 20}};
        System.out.println(Arrays.deepToString(myArray)); // Arrays.deepToString() - это метод для вывода двумерного массива
        System.out.println(myArray[0].length);
    }
}