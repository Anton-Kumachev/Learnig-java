package Temp;

public class Test17_ru_code {
    public static void main(String[] args) {
        System.out.println(countChars("HexlEt", 'e'));
        System.out.println(countChars("HexlEt", 'E'));
    }

    public static int countChars(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
        // END
    }
}



