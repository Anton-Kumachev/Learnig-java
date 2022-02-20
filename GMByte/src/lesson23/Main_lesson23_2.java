package lesson23;

public class Main_lesson23_2 {
    public static void main(String[] args) {

        String s ="Hello"; //Строка попадает в String Pool
        String s1 ="Hello"; //Строка попадает в String Pool

        if (s == s1) {
            System.out.println("s равна s1");
        } else if (s != s1) {
            System.out.println("s не равна s1");
        }
    }
}
