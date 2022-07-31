package Learning_Massives;
//Пример 1.
//Заполнение массива из 10 чисел, числами от 1 до 10:
public class MainClassExample1_1 {

        public static void main(String[] args)
        {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = i + 1; //Заполнение массива
                System.out.println(numbers[i]); //Вывод всех значений массива на экран
            }

        }

}
