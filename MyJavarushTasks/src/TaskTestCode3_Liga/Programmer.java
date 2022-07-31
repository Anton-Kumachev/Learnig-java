package TaskTestCode3_Liga;

public class Programmer extends Writer {
    public void write() {
        System.out.println("Writing code");
        super.write();
    }
    public static String name = "Programmer";

    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
        System.out.println(w.name);
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1);
        System.out.println(num1++ == num2);
        System.out.println(num1);


    }

    public void notReader() {

    }
}