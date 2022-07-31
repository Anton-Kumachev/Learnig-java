package level7_9;
//package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution_hard1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> bigList = new ArrayList<>(50); //Если прописать ёмкость(initialCapacity) списка
        // это лишь даст нам  размер, которого может достичь список, прежде чем ему в следующий раз
        // потребуется скопировать значения. Это не изменяет логический размер ArrayList.
        // Поэтому list.size() == 0, пока мы не зададим размер списка с помощью цикла.
        //Проверка этого утверждения:
        System.out.println(bigList.size());
        ArrayList<Integer> list1 = new ArrayList<>(); //Список1 - числа нацело делится на 3
        ArrayList<Integer> list2 = new ArrayList<>(); //Список2 - числа нацело делится на 2
        ArrayList<Integer> list3 = new ArrayList<>(); //Список3 - все остальные

        for (int i = 0; i < 20; i++) {
            bigList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < bigList.size(); i++) {

            int x = bigList.get(i);

            if (x % 3 == 0) {
                list1.add(x);
            }

            if (x % 2 == 0) {
                list2.add(x);
            } else if (x % 3 != 0 && x % 2 !=0 ){
                list3.add(x);
            }
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}