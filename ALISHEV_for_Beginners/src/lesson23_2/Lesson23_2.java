package lesson23_2;

public class Lesson23_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello"); //StringBuilder mutable
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());

        sb.append(" my2").append(" friend2");
        System.out.println(sb.toString());
    }
}