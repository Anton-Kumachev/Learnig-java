package Temp;

public class Test23_ru_code {
    public static void main(String[] args) {
        System.out.println(encrypt("move")); // "omev"
        System.out.println(encrypt("attack")); // "taatkc
    }

    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        var result = "";
        for (int i = 0; i < str.length(); i+= 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.charAt(i + 1);
            result = result + nextSymbol + str.charAt(i);
            }
            return result;
        // END
    }
}
