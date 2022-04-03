package lesson48_3;

//ENUM 2

public class Test {
    public static void main(String[] args) {
        Season season = Season.SUMMER;

        switch(season) {
            case SUMMER:
                System.out.println("It's hot outside!");
                break;
            case AUTUMN:
                System.out.println("It's cold outside!");
                break;
            case WINTER:
                System.out.println("It's frosty outside!");
                break;
            case SPRING:
                System.out.println("It's cold outside!");
                break;
        }
    }
}
