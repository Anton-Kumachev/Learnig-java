package lesson16;

public class Massives {
    public static void main(String[] args) {
        byte[] mas = new byte[6];
        for (byte i = 0; i < 6; i++) {
            mas[i] = i;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(mas[i]);
        }
    }
}
