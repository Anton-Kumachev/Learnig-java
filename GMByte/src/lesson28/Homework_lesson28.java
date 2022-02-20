package lesson28;

public class Homework_lesson28 {

    public static void main(String[] args) {
    //Заполнение массива вручную:
        byte[][] mas = new byte[4][4];
        mas[0][0] = 1;
        mas[0][1] = 2;
        mas[0][2] = 3;
        mas[0][3] = 4;

        mas[1][0] = 5;
        mas[1][1] = 6;
        mas[1][2] = 7;
        mas[1][3] = 8;

        mas[2][0] = 9;
        mas[2][1] = 10;
        mas[2][2] = 11;
        mas[2][3] = 12;

        mas[3][0] = 13;
        mas[3][1] = 14;
        mas[3][2] = 15;
        mas[3][3] = 16;

        for (int i = 0; i < mas.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " ");
            }
        }
    }
}