package lesson30;

public class Test {
    public static void main(String[] args) {
        int x = 123; //-128 до 127
        long y = 123;
        double a = 12.3;
        float q = 12.2f;

        float f = 123.2f;

        int b = 123;
        long l = b; //неявное приведение типов
        int z = (int)l; //явное приведение типов
        System.out.println(z);

        double w = a;
        System.out.println(w);

        double o = 123.6;
        int p = (int)w;
        System.out.println(p);

        long xl = Math.round(o);
        System.out.println(xl);

        byte g = (byte)128; //так делать нельзя, вышли за границы типа
        System.out.println(g);
        byte h = (byte)256; //так делать нельзя, вышли за границы типа, пошли на второй круг
        System.out.println(h);
        byte k = (byte)512; //так делать нельзя, вышли за границы типа, пошли на второй круг
        System.out.println(k);
    }
}
