package Learning_Sort;

import java.util.Arrays;

public class MyTestBubleSort2 {
    public static void main(String[] args) {
        int[] arrayTest = {64, 32, 128, 8, 256, 4, 2};

        System.out.print("[");
        for (int i = 0; i < arrayTest.length; i++) {
            System.out.print(arrayTest[i] + ", ");
        }
        System.out.println("]");
        System.out.println();

        //Метод сортировки пузырьком:
        for (int i = arrayTest.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayTest[j] > arrayTest[j + 1]) {
                    int tmp = arrayTest[j];
                    arrayTest[j] = arrayTest[j + 1];
                    arrayTest[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayTest));
    }
}
