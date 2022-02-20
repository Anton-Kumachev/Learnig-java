package lesson16;

public class Homework_lesson16_2 {

    public static void main(String[] args) {

        byte[] mass = new byte[21];
        byte x = 0;
        while (x < 20 ) {
            x++;
            mass[x] = x;
        }

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(mass[i]);
            }
        }
    }
}
