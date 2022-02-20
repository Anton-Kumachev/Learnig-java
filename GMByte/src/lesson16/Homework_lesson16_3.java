package lesson16;

public class Homework_lesson16_3 {

    public static void main(String[] args) {

        MassClass[] massClass = new MassClass[7];
        for (int i = 0; i < massClass.length; i++) { //massClass.length - это вся длина массива
                massClass[i] = new MassClass(); // Создаём объекты массива
        }
        massClass[0].a = 1;
        massClass[0].b = 2;
        massClass[1].a = 3;
        massClass[1].b = 4;
        massClass[2].a = 5;
        massClass[2].b = 6;
        massClass[3].a = 7;
        massClass[3].b = 8;
        massClass[4].a = 9;
        massClass[4].b = 10;
        massClass[5].a = 11;
        massClass[5].b = 12;
        massClass[6].a = 13;
        massClass[6].b = 14;

        System.out.println(massClass[0].a);
        System.out.println(massClass[0].b);
        System.out.println(massClass[1].a);
        System.out.println(massClass[1].b);
        System.out.println(massClass[2].a);
        System.out.println(massClass[2].b);
        System.out.println(massClass[3].a);
        System.out.println(massClass[3].b);
        System.out.println(massClass[4].a);
        System.out.println(massClass[4].b);
        System.out.println(massClass[5].a);
        System.out.println(massClass[5].b);
        System.out.println(massClass[6].a);
        System.out.println(massClass[6].b);
    }
}
