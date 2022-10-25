package Temp.Test13;
//https://javarush.ru/groups/posts/3663-zachem-nuzhen-polimorfizm

//Зачем нужен полиморфизм?

public class Спальня {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Object случайный = посмотретьКтоСпит();

            if (случайный.getClass().equals(Мама.class)) {
                Мама мама = (Мама) случайный;
                System.out.println(мама. какСпит());
            }
            if (случайный.getClass().equals(Папа.class)) {
                Папа папа = (Папа) случайный;
                System.out.println(папа. какСпит());
            }
        }
    }

    public static Object посмотретьКтоСпит() {
        int a = 1 + (int) (Math.random() * 2);
        if (a == 1) {
            return new Мама();
        }
        if (a == 2) {
            return new Папа();
        }
        return null;
    }
}
