package lesson26;

public class Main_lesson26 {

    public static void main(String[] args) {
        // Линейный массив(обычный)
        byte[] a = new byte[3];
        a[0] = 12;
        a[1] = 13;
        a[2] = 14;

        System.out.println(a[1]);

        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
