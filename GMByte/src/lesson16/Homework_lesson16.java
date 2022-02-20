package lesson16;

public class Homework_lesson16 {

    public static void main(String[] args) {

        byte[] mass = new byte[21];
        for (byte i = 0; i < 20; i++) {
            mass[i] = i;
        }

        for (int i = 20; i <= 20; i--) {
            if (i > 0) {
                System.out.println(mass[i]);
            }
        }
    }
}
