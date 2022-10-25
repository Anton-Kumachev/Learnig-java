package Temp;

public class Test19_ru_code {
    public static void main(String[] args) {
        System.out.println(reverse("Brawn"));
    }

    public static String reverse(String str) {
        // BEGIN (write your solution here)
        var i = str.length() - 1;
        var result = "";
        while (i >= 0) {
            result = result + str.charAt(i) ;
            i = i - 1;
        }
        return result;
        // END
    }
}
