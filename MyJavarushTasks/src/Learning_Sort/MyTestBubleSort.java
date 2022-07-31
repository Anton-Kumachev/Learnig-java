package Learning_Sort;

import java.util.Arrays;

public class MyTestBubleSort {
    public static void main(String[] args) {
        int[] massive = {37, 58, 8, 25, 11, 99, 50, 13, 15, 90};
        //Метод сортировки пузырьком:
        for (int i = massive.length - 1;  i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massive[j] > massive[j + 1]) {
                    int tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
