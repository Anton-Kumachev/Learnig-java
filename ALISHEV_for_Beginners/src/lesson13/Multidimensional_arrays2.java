package lesson13;

public class Multidimensional_arrays2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][]matrice = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}}; //Двумерный массив
        for (int i = 0; i < matrice.length; i++) { //3 столбцы
            for (int j = 0; j < matrice[i].length; j++) { //matrice[i].length - длина  элемента двумерного массива
                System.out.print(matrice[i][j] +" ");
            }
            System.out.println();
        }
    }
}
