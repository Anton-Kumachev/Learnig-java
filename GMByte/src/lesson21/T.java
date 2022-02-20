package lesson21;

public class T implements Test, Test2, Test3 {


    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void test2() {
        System.out.println("test2");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void start2() {
        System.out.println("start2");
    }

    @Override
    public void tut() {
        System.out.println("tut");
    }

    @Override
    public void tut2() {
        System.out.println("tut2");
    }
}
