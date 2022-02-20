package lesson23;

public class Main_lesson23 {
    public static void main(String[] args) {

        String s = new String("Hello");
        String s1 = new String("Hello");

        if (s.equals(s1)) {
            System.out.println("s равна s1");
        } else if (!(s.equals(s1))) {
            System.out.println("s не равна s1");
        }
    }
}
