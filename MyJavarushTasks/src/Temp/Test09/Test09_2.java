package Temp.Test09;

public class Test09_2 {

    public static void main(String[] args) {
        int x = 7;
        int result = incrementNumber(x);
        System.out.println(result);

        Cat cat = new Cat(7);
        catLevelUp(cat);
        System.out.println(cat.getAge());

    }

    public static void catLevelUp(Cat cat) {

        cat.setAge(cat.getAge() + 1);
    }

    public static int incrementNumber(int x) {
        x++;
        return x;
    }
}
