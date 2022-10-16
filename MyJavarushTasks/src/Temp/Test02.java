package Temp;

public class Test02 {
    public static void main(String[] args) {
        String str1 = "I love Java";

        String str2 = str1;//обе переменные-ссылки указывают на одну строку.
        System.out.println(str2);

        str1.substring(10);//обрезаем исходную строку
        System.out.println(str2);
    }
}
