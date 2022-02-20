package lesson35_test;

// Эксперииментирую с классами и доступом/видимостью переменных по отношению к static
public class Main_test {

    public static void main(String[] args) {

        System.out.println(Test1.a1);
        //System.out.println(Test1.a2); - переменная не статическая, поэтому нет доступа к ней
        System.out.println(Test2.b1);
        System.out.println(Test2.b2); //Обе переменные статические, поэтому к ним есть доступ из метода main
        System.out.println(smallMain.a);
    }

    public static class smallMain { // Только вложеный класс может быть static
        static int a = 100;
    }
}
