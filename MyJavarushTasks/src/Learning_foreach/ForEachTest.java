package Learning_foreach;

//Массив из оценок ученика.

public class ForEachTest {
    public static void printAllGrades(int[] grades) {
        System.out.print("|");
        for (int num : grades) { //Цикл foreach
            System.out.print(num + "|");
        }
        System.out.println();
    }
//метод, в котором выводится средняя оценка
    public static double midGrade(int[] numbers) {
        int grade = 0;
        for (int num : numbers) { //Цикл foreach
            grade = num + grade;
        }
        return ((double) grade / numbers.length);
    }
    //метод в котором вычисляется лучшая (максимальная) оценка
    public static int bestGrade(int[] numbers) {
        int maxGrade = numbers[0];

        for (int num : numbers) { //Цикл foreach
            if (num > maxGrade) {
                maxGrade = num;
            }
        }
        return maxGrade;
    }

    public static void main(String[] args) {
//массив оценок
        int[] grades = {5, 10, 7, 8, 9, 9, 10, 12};

        int highest_marks = bestGrade(grades);
        System.out.print("All the grades: ");
        printAllGrades(grades);
        System.out.println("The highest grade is " + highest_marks);
        System.out.println("The average grade is " + midGrade(grades));
    }
}