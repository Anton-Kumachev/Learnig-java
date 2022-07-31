package Learning_Massives;
//Цикл foreach или расширенный цикл for, который позволяет
// последовательно пройти весь массив без использования индекса переменной.
public class TestArray2 {

    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Вывести массив на экран
        for (double element: myList) {
            System.out.println(element);
        }
    }
}