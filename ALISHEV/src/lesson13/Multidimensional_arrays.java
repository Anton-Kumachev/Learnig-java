package lesson13;

public class Multidimensional_arrays {

    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][]matrice = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}}; //Двумерный массив
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);

        int[][]matrice2 = {{1, 2, 3, 4, 5},
                           {4},
                           {7, 8}}; //Двумерный массив
        System.out.println(matrice2[0][4]);

        int[] number1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "Привет!";
        System.out.println(strings[0][1]);
    }
}
