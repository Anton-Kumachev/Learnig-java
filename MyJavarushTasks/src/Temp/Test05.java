package Temp;

public class Test05 {
    public static void main(String[] args) {
        Integer a = new Integer(0);
        Integer b = new Integer(0);

        b = a;
        a = 1;
        System.out.println(b);
        System.out.println(a);
    }
}
