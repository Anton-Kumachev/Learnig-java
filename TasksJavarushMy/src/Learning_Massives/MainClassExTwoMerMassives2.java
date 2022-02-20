package Learning_Massives;
// Непрямоугольные двумерные массивы

public class MainClassExTwoMerMassives2 {
    public static void main(String[] args) {

        //объявляем и создаём массив, указывая только количество строк
        int[][] twoDimArray = new int[5][];

//инициализируем массив, заполняя его массивами разной длины
        twoDimArray[0] = new int[]{1, 2, 3, 4, 5};
        twoDimArray[1] = new int[]{1, 2, 3, 4};
        twoDimArray[2] = new int[]{1, 2, 3};
        twoDimArray[3] = new int[]{1, 2};
        twoDimArray[4] = new int[]{1};
//выведем получившийся непрямоугольный двумерный массив на экран
        for (int i = 0; i < twoDimArray.length; i++) { //twoDimArray.length - длина каждого столбца
            for (int j = 0; j < twoDimArray[i].length; j++) { //twoDimArray[i].length - длина каждой строки
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
