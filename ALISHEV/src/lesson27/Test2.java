package lesson27;

//Примеры импорта классов:
import lesson27.Forest.*; //Теперь мы можем использовать любой класс из этого пакета
import lesson27.Forest.Something.SomeClass; // Но если мы хотим использовать класс из вложенного
                                            // пакета, нужно указать полный путь этого пакета
import java.util.*;


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        Squirell s1 = new Squirell();
        Scanner scanner = new Scanner(System.in);
        SomeClass someInstace2 = new SomeClass();
    }
}
