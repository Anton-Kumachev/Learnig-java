package lesson26;

public class Homework_lesson26_2 {

    public static void main(String[] args) {

        String[][] s = new String[10][10];
        //автоматическое заполнение массива 10*10
        for (int i = 0; i < 10; i++) { // i - это номер столбца
            System.out.println("");
            for (int j = 0; j < i; j++) { // j - это номер строки
                s[j][i] = "*";
                System.out.print(s[j][i]);
            }
        }
    }
}
