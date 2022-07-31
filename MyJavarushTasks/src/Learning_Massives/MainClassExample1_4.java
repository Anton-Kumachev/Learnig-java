package Learning_Massives;
//Пример 1.
//Заполнение массива из 10 чисел, числами от 0 до 9:
public class MainClassExample1_4 {

        public static void main(String[] args)
        {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = 9 - i;
                System.out.println(numbers[i]); //Вывод всех значений массива на экран
            }

        }

}
