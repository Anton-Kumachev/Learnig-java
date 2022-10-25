package Temp;

public class Test21_ru_code {
    public static void main(String[] args) {
        System.out.println(makeItFunny("I never look back", 3));
    }

    public static String makeItFunny(String str, int n) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";
        while(i < str.length()) {
            var currentChar = str.charAt(i);
            if ((i+1) % n == 0) {
                result += Character.toUpperCase(currentChar);
            } else {
                result = result + currentChar;
            }
            i++;
        }
        return result;
    }
    // END
}