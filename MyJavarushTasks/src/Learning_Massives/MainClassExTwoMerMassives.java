package Learning_Massives;
// Двумерные массивы

import java.util.Arrays;

public class MainClassExTwoMerMassives {
    public static void main(String[] args) {

        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};//объявили двумерный массив [3] [4] и заполнили его элементами
        for (int i = 0; i < 3; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        System.out.println(twoDimArray[0].length); //Длина массива (количество столбцов)

        //Быстрый вывод двумерного массива:
        int[][] myArray = {{18,28,18},{28,45,90},{45,3,14}};
        System.out.println(Arrays.deepToString(myArray));  // применение метода deepToString() класса Arrays
    }
}
