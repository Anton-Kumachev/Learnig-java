package Learning_Massives;
//Пример: Вывод массива
import java.util.Arrays;

public class TestArray7_Out {
    public static void main(String[] args) {
        // Вывод на экран массива myArray из 5 элементов типа double.
        double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8};

        // Вывод(1) массива на экран с помощью улучшенного цикла for.
        System.out.print("Вывод(1) элементов массива myList: ");
        for(double element : myList) {
            System.out.print(element + ", ");
        }
        System.out.println("");
        // Вывод(2) элементов массива на экран.
        System.out.println("Вывод(2) элементов массива myList: " + Arrays.toString(myList));

        // Вывод(3) элементов массива на экран.
        System.out.print("\nВывод(3) элементов массива myList: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + ", ");
        }
    }
}