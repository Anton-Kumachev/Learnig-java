package lesson28;

public class Main_lesson28 {
    public static void main(String[] args) {

        byte[][][] mas = new byte[2][2][3];
        mas[0][0][0] = 1;
        mas[0][0][1] = 2;
        mas[0][0][2] = 3;
        mas[0][1][0] = 4;
        mas[0][1][1] = 5;
        mas[0][1][2] = 6;
        mas[1][0][0] = 7;
        mas[1][0][1] = 8;
        mas[1][0][2] = 9;
        mas[1][1][0] = 10;
        mas[1][1][1] = 11;
        mas[1][1][2] = 12;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println(mas[i][j][k] );
                }
            }
        }
    }
}
