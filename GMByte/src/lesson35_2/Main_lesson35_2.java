package lesson35_2;

public class Main_lesson35_2 {
    public static void main(String[] args) {
        AbstractMethodError aer = new AbstractMethodError();
        test("             Строка              ");
        test(aer);
    }

    static void test(Object obj) {
        if (obj instanceof String) {
            String s = (String)obj;
            s = s.trim();
            System.out.println(s);
        } else {
            System.out.println("Error");
        }
    }
}
