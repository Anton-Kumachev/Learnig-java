package lesson12;
//Java для начинающих. Урок 12: Цикл for each, Массивы строк.
public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Привет, ";
        strings[1] = "пока";
        strings[2] = "Джава!";
        System.out.print(strings[0]);
        System.out.println(strings[2]);
        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string : strings) //Цикл for each;         Тип данных / переменная / массив
            System.out.println(string);

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for(int x : numbers1) {     //Цикл for each;         Тип данных / переменная / массив
            sum = sum + x;
        }
        System.out.println("");
        System.out.println("Сумма строк массива numbers1: " + sum);

        int value = 0;
        String s = null;  //ссылочная переменная, память(null) выделяется под ссылку
        System.out.println(s);
    }
}
