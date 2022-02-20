package lesson26;

public class Main_lesson26_2 {

    public static void main(String[] args) {
        // Двумерный массив
        byte[][] two = new byte[3][3];

        two[0][0] = 1;
        two[0][1] = 2;
        two[0][2] = 3;
        two[1][0] = 4;
        two[1][1] = 5;
        two[1][2] = 6;
        two[2][0] = 7;
        two[2][1] = 8;
        two[2][2] = 9;

        System.out.println(two[1][0]);

        System.out.println("");
        for (int i = 0; i < 3; i++) { // i - это номер столбца
            for (int j = 0; j < 3; j++) { // j - это номер строки
                System.out.println(two[i][j]);
            }
        }
        
    }
}

