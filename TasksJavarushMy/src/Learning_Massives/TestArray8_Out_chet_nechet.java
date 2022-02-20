package Learning_Massives;
//Пример: Вывод четных и нечетных элементов массива
public class TestArray8_Out_chet_nechet {
    public static void main(String[] args) {
        // Массива myArray из 5 элементов типа double.
        double[] myList = {2, 2.7, 3, 12, 23.8};

        // Вывод четных элементов массива на экран.
        System.out.print("Чётные элементы массива myList: ");
        for (int i = 0; i < myList.length; i++) {
            if(myList[i]%2 == 0){
                System.out.print(myList[i] + ", ");
            }
        }

        // Вывод нечетных элементов массива на экран.
        System.out.print("\nНечётные элементы массива myList: ");
        for (int i = 0; i < myList.length; i++) {
            if(myList[i]%2 != 0){
                System.out.print(myList[i] + ", ");
            }
        }
    }
}