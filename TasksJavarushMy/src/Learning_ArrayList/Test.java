package Learning_ArrayList;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Hey!");
        myArrayList.add("This");
        myArrayList.add("is");
        myArrayList.add("my");
        myArrayList.add("first");
        myArrayList.add("list!");

        myArrayList.remove(0);
        //Вывод списка на экран, перебором в цикле
        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i));
    }
}