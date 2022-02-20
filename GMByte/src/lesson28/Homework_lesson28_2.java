package lesson28;

public class Homework_lesson28_2 {

    public static void main(String[] args) {
        // сокращённое заполнение двумерноо массива:
        byte[][] mas2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13}};

        for (int i = 0; i < mas2.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < mas2.length; j++) {
                System.out.print(mas2[i][j] + " ");
            }
        }
    }
}