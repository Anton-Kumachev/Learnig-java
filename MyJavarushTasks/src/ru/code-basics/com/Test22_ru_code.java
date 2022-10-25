package Temp;

public class Test22_ru_code {
    public static void main(String[] args) {
        System.out.println(hasChar("Renly", 'R'));
        System.out.println(hasChar("Renly", 'r'));
        System.out.println(hasChar("Tommy", 'm'));
        System.out.println(hasChar("Tommy", 'd'));
    }

    public static boolean hasChar(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }
            i++;
        }
        return false;
        // END
    }
}
