package level7_9;

import java.util.ArrayList;

public class TestCharAt2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");       //0
        list.add("зонтик");     //1
        list.add("преграда");   //2
        list.add("треск");      //3
        list.add("флокус");     //4
        list.add("гиря");       //5
        System.out.println("Список до изменений: " + list.size());

        for (String string : list) {

            for (int j = 0; j < string.length(); j++) {

                if (string.charAt(j) == 'р') {
                    //list.remove(x);
                    list.add(list.indexOf(string),"слово");
                    System.out.println(string);
                }

            }
            //System.out.println(x);
        }
        System.out.println("Список после изменений: " + list.size());
    }
}
