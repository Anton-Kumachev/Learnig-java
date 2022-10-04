package level9;

public class Main {
    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(var info: methods)
            System.out.println(info);
    }
}