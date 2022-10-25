package Temp;

public class Test18_ru_code {
    public static void main(String[] args) {
        System.out.println(reverse("Brawn"));
    }

    public static String reverse(String str) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";
        while (i < str.length()) {
            result = str.charAt(i) + result;
            i = i + 1;
        }
        return result;
    }
}
