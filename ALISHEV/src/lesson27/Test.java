package lesson27;

//Примеры импорта классов:
import lesson27.Forest.Something.SomeClass;
import lesson27.Forest.Squirell;
import lesson27.Forest.Tree;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Squirell squirell = new Squirell();
        Scanner scanner = new Scanner(System.in);
        SomeClass someInstace = new SomeClass();
    }
}
