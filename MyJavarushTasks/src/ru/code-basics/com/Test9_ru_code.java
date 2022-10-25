
package Temp;

public class Test9_ru_code {
    public static void main(String[] args) {
        var hiddenNumberCard = getHiddenCard("1234123412341234", 6);
        System.out.println(hiddenNumberCard);
        var hiddenNumberCard2 = getHiddenCard("1234123412341234");
        System.out.println(hiddenNumberCard2);
    }
    public static String getHiddenCard (String numberCard){
        var hiddenNumberCard = "*".repeat(4) + numberCard.substring(numberCard.length() - 4, numberCard.length());
        return hiddenNumberCard;
    }
    public static String getHiddenCard (String numberCard, int a){
            var hiddenNumberCard = "*".repeat(a) + numberCard.substring(numberCard.length() - 4, numberCard.length());
            return hiddenNumberCard;
        }
}

