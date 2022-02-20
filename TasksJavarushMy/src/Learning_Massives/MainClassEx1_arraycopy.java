package Learning_Massives;

//Метод System.arraycopy() для копирования элементов из одного массива в другой

public class MainClassEx1_arraycopy {

    public static void main(String[] args) {
        System.out.println("Массив на 10 элементов:");
        int [] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};//Создание массива на 10 элементов сразу с инициализированными значениями
            for (int i = 0; i < sourceArr.length; i++) { // Вывод всех элементов массива на экран
                System.out.print(sourceArr[i] + " ");
            }
        System.out.println(""); //пропуск строки

        int[] destArr = new int[5]; //Массив назначения
        System.out.println("Пока массив на 5 элементов пустой:");
        for (int i = 0; i < destArr.length; i++) { // Заполнение первыми пятью элементами массива sourceArr
            System.out.print(destArr[i] + " ");  // и вывод всех элементов массива на экран до копирования
        }
        System.out.println(""); //пропуск строки

        System.arraycopy (sourceArr, 5, destArr, 0, 5); //Код, чтобы скопировать
        // последние пять элементов исходного массива в конечный массив (массив-назначения):

        System.out.println("Прошло копирование пяти последних элементов большого массива:");
        for (int i = 0; i < destArr.length; i++) { //Код для вывода элементов в конечном массиве
            System.out.print(destArr[i] + " ");
        }
    }
}
