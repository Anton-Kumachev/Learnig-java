package lesson42_4;

public class Test {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello123".substring(0, 5); // метод substring() в данном случае отсекает последние три элемента
        System.out.println(b);
        System.out.println(a == b);
    }
}
