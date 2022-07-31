package Learning_LinkedList;

import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Anton");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Tomsk!");
        String str5 = new String("I will live in Saint Petersburg!");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);
        earlBio.add(str5);

        System.out.println(earlBio);
    }
}
