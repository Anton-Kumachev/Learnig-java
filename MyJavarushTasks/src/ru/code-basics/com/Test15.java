package Temp;

public class Test15 {
    public static void main(String[] args) {
        System.out.println(whoIsThisHouseToStarks("Karstark"));
        System.out.println(whoIsThisHouseToStarks("Frey"));
        System.out.println(whoIsThisHouseToStarks("Joar"));
        System.out.println(whoIsThisHouseToStarks("Ivanov"));
    }
       // BEGIN (write your solution here)
    public static String whoIsThisHouseToStarks(String family) {
        if ("Karstark".equals(family) || "Tally".equals(family)) {
            return "friend";
        } else if ("Lannister".equals(family) || "Frey".equals(family))  {
            return "enemy";
        }
        return "neutral";
    }
    // END
}
