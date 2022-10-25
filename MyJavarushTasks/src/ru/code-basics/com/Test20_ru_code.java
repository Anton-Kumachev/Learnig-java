package Temp;

public class Test20_ru_code {
    public static void main(String[] args) {
        String newSentence = filterString("If I look back I am lost", 'I'); // "f  look back  am lost"
        System.out.println(newSentence);
    }

    public static String filterString(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";
        while(i < str.length()) {
            var currentChar = str.charAt(i);
            if (currentChar != ch) {
                result += currentChar;
            }
            i += 1;
        }
        return result;
    }
    // END
}