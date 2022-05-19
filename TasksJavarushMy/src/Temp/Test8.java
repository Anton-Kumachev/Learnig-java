
package Temp;

public class Test8 {
    public static void main(String[] args) {
        var result1 = Test8.truncate("текст", 3);
        var result2 = Test8.truncate("и пошла вода", 5);

    }
        public static String truncate (String str,int a){
            var text = str.substring(0, a) + "...";
            return text;
        }
}

