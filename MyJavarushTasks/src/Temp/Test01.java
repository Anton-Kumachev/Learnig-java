package Temp;

public class Test01 {
    public static void main(String[] args) {
        String str1 = "I love Java";

        String str2 = str1;//обе переменные-ссылки указывают на одну строку.
        System.out.println(str2);

        String str1AfterReplacement =  str1.replace("Java", "Python");
        System.out.println(str2);

        System.out.println(str1AfterReplacement);
    }
}
