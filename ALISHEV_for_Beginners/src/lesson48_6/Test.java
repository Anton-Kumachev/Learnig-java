package lesson48_6;

//ENUM

public class Test {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.name());

        Animal animal = Animal.CAT;
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); //Метод ordinal() для выяснения индекса элемента ENUMа
    }
}
